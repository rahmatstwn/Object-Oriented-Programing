public class Employee {
    int id;
    String FirstName;
    String LastName;
    int salary;
    public Employee(int id, String FirstName, String LastName, int salary){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.salary = salary;
    }
    int GetID(){
        return id;
    }
    String GetFirst(){
        return FirstName;
    }
    String GetLast(){
        return LastName;
    }
    String GetName(){
        return this.FirstName+" "+this.LastName;
    }
    int GetSalary(){
        return salary;
    }
    public void SetSalary(int salary){
        this.salary = salary;
    }
    int GetAnnualSalary(){
        return salary * 12;
    }
    int raiseSalary(double persen){
        double baru = persen * salary;
        return (int) (salary + baru);
    }
    public String toString(){
        return "Employee [id : "+this.GetID()+", name : "+this.GetFirst()+" "+this.GetLast()+", salary : "+this.GetSalary()+" ]";
    }
}
