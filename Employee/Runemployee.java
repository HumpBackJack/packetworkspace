package Employee;


public class Runemployee {
    public static void main(String[]args){
        Employee e = new Employee(40000.0);
        e.increase( 2000.0 );
        double p = e.getPay();
        System.out.println( "salary is " + p );


        e.increase( -500.0);
        p = e.getPay();
        System.out.println( "salary is " + p );


        e.increase( 3000.0);
        p = e.getPay();
        System.out.println( "salary is " + p );
    }
}






