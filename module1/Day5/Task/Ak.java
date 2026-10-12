package Day5.Task;

 class Ak extends Employee {
    public Ak(int id, String name, double salary) {
        super(id, name, salary);
    }

     @Override
     public String display() {
         return "Id "+getId() + " Name: "+getName()+" Salary: "+getSalary();
     }
}
