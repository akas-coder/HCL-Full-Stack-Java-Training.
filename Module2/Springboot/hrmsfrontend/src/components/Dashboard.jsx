
import React, { useEffect, useState } from 'react'
import { useLocation } from 'react-router-dom'

function Dashboard() {
  const location = useLocation()
  const employee = location.state?.employee

  const [attendance, setAttendance] = useState([])

  useEffect(() => {
    async function getAttendance() {
      if (!employee) return

      try {
        const response = await fetch(
          `http://localhost:8080/v1/attendance/employee/${employee.empId}`
        )

        if (response.ok) {
          const data = await response.json()
          setAttendance(data)
        }
      } catch (error) {
        console.log(error)
      }
    }

    getAttendance()
  }, [employee])

  if (!employee) {
    return <h3>Please log in first.</h3>
  }

  return (
    <div className="container mt-4">
      <h2>Employee Dashboard</h2>

      <p>Name: {employee.emp_name}</p>
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
              <td>{item.attendancedate}</td>
              <td>{item.inTime || '-'}</td>
              <td>{item.outTime || '-'}</td>
              <td>{item.comment || '-'}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default Dashboard
