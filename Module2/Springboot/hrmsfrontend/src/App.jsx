
import './App.css'
import SampleCode from './components/SampleCode'
import UseFetchApi from './components/UseFetchApi'


function App() {
  const employee=[
  {  ename:"Rahul", empid:"120"},
  {  ename:"sahul", empid:"121"},
  {  ename:"menon", empid:"122"},
  {  ename:"rakes", empid:"123"},
  ]


  return (
    <>
      <h2>Welcome to HRMS</h2>
     {/* {
      employee.map(ele=>
        <h3>
        <SampleCode empdata={ele}/>
        <br />
        </h3>
      )
     } */}
     {/* <SampleCode/> */}
     <UseFetchApi/>
    </>
  )
}

export default App
