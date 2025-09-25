package Employee;


public class Employee {


    private double salary;

    public Employee(double initialSalary) {
        this.salary = initialSalary;
    }


    public void increase( double i ){
        if (i >= 0){
            salary = salary + i;
        }
    }
    public double getPay(){
        return salary;
    }


}
