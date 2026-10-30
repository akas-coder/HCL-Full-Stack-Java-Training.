package com.abes.hrmsdatabase.service;
import com.abes.hrmsdatabase.model.Attendance;
import com.abes.hrmsdatabase.repository.AttendenceRepository;
import com.abes.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class AttendenceService {
    @Autowired
    private AttendenceRepository attendenceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;
    public Optional<Attendance> markAttendance(Attendance attendance) {
        Long empId = attendance.getEmployee().getEmpId();
        LocalDate today = LocalDate.now();
        boolean exists = attendenceRepository
                .existsByEmployee_EmpIdAndAttendancedate(empId, today);
        if (exists) {
            return Optional.empty();
        }
        attendance.setAttendancedate(today);
        attendance.setInTime(LocalDateTime.now());
        Attendance savedAttendance =
                attendenceRepository.save(attendance);
        return Optional.of(savedAttendance);
    }
    // Get employee attendance records
    public List<Attendance> getAttendance(Long empId) {
        if (!employeeRepository.existsById(empId)) {
            throw new IllegalArgumentException(
                    "Employee does not exist");
        }
        return attendenceRepository
                .findByEmployee_EmpIdOrderByAttendancedateDesc(empId);
    }
    public Optional<Attendance> checkout(Long empId) {
        LocalDate today = LocalDate.now();
        Optional<Attendance> attendanceOpt =
                attendenceRepository
                        .findByEmployee_EmpIdAndAttendancedate(empId, today);
        if (attendanceOpt.isPresent()) {
            Attendance attendance = attendanceOpt.get();
            attendance.setOutTime(LocalDateTime.now());
            Attendance updatedAttendance =
                    attendenceRepository.save(attendance);
            return Optional.of(updatedAttendance);
        }
        return Optional.empty();
    }
}