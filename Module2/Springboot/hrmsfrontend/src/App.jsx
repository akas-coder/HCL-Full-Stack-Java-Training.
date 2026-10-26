
import { Route, Routes } from 'react-router-dom'
import './App.css'
import Navbar from './components/Navbar'
import SampleCode from './components/SampleCode'
import UseFetchApi from './components/UseFetchApi'
import Home from './components/Home'
import AddEmployee from './components/AddEmployee'


function App() {
//   const employee=[
//   {  ename:"Rahul", empid:"120"},
//   {  ename:"sahul", empid:"121"},
//   {  ename:"menon", empid:"122"},
//   {  ename:"rakes", empid:"123"},
//   ]


  return (
    <>
    <Navbar/>
      <h2>Welcome to HRMS</h2>
     {/* {
      employee.map(ele=>
        <h3>
        <SampleCode empdata={ele}/>
        <br />
        </h3>
      )
     } 
     <SampleCode/> 
      <UseFetchApi/> */}
     <Routes>
      <Route path="/" element={<Home/>}/>
      <Route path="/addEmployee" element={<AddEmployee/>}/>
     </Routes>
    </>
  );
}


export default App
