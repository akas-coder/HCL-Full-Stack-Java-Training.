
import React, { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';

function Dashboard() {
  const location = useLocation();
  const employee = location.state?.employee;

  const [attendance, setAttendance] = useState([]);

  // Convert LocalDateTime to time only
  function formatTime(value) {
    if (!value) {
      return '-';
    }

    // Example: 2026-10-29T09:30:15
    if (typeof value === 'string' && value.includes('T')) {
      return value.split('T')[1].substring(0, 8);
    }

    return value || '-';
  }

  // Fetch attendance records
  async function getAttendance() {
    if (!employee?.empId) {
      return;
    }

    try {
      const response = await fetch(
        `http://localhost:8080/v1/user/attendance/dashboard/${employee.empId}`
      );

      if (response.ok) {
        const data = await response.json();
        setAttendance(data);
      } else {
        console.error('Failed to fetch attendance records');
      }
    } catch (error) {
      console.log(error);
    }
  }

  useEffect(() => {
    getAttendance();
  }, [employee?.empId]);

  async function checkIn() {
  try {
    const response = await fetch(
      'http://localhost:8080/v1/user/attendance/markAttendance',
      {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          employee: {
            empId: Number(employee.empId)
          }
        })
      }
    );

    if (response.ok) {
      const attendanceData = await response.json();

      alert(
        `Checked in at ${formatTime(attendanceData.inTime)}`
      );

      await getAttendance();
    } else {
      alert('Already checked in today');
    }
  } catch (error) {
    console.log(error);
    alert('Unable to connect to server');
  }
}
async function checkout() {
  try {
    const response = await fetch(
      `http://localhost:8080/v1/user/attendance/checkout/${employee.empId}`,
      {
        method: 'POST'
      }
    );

    if (response.ok) {
      const attendanceData = await response.json();

      alert(
        `Checked out at ${formatTime(attendanceData.outTime)}`
      );

      await getAttendance();
    } else {
      alert('Check-out failed');
    }
  } catch (error) {
    console.log(error);
    alert('Unable to connect to server');
  }
}

  if (!employee) {
    return <h3>Please log in first.</h3>;
  }

  return (
    <div className="container mt-4">
      <h2>Employee Dashboard</h2>

      <button
        className="btn btn-success me-2"
        onClick={checkIn}
      >
        Check In
      </button>

      <button
        className="btn btn-danger"
        onClick={checkout}
      >
        Check Out
      </button>

      <hr />

      <p>Name: {employee.emp_name}</p>
      <p>Employee ID: {employee.empId}</p>
      <p>Email: {employee.email}</p>

      <hr />

      <h3>Attendance Summary</h3>

      <div className="card p-3 mb-3">
        <h5>Total Present Days</h5>
        <h2>{attendance.length}</h2>
      </div>

      <h4>Attendance Records</h4>

      <table className="table table-bordered">
        <thead>
          <tr>
            <th>Date</th>
            <th>In Time</th>
            <th>Out Time</th>
            <th>Comment</th>
          </tr>
        </thead>

        <tbody>
          {attendance.map((item) => (
            <tr key={item.attendanceId}>
              <td>{item.attendancedate || '-'}</td>
              <td>{formatTime(item.inTime)}</td>
              <td>{formatTime(item.outTime)}</td>
              <td>{item.comment || '-'}</td>
            </tr>
          ))}

          {attendance.length === 0 && (
            <tr>
              <td colSpan="4" className="text-center">
                No attendance records found
              </td>
            </tr>
          )}
        </tbody>
      </table>
    </div>
  );
}

export default Dashboard;
