package polymorphism;
// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {

    public static void main( String[] args ) {

        // create subclass objects
        SalariedEmployee salariedEmployee =
            new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee ( "Karen", "Price", "222-22-2222", 16.75, 40 );
        CommissionEmployee commissionEmployee =
            new CommissionEmployee(
                "Sue", "Jones", "333-33-3333", 10000, .06 );
        BasePlusCommissionEmployee2 baseplusCommissionEmployee2 = 
            new BasePlusCommissionEmployee2( 
                "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
                
        System.out.println( "Employees processed individually:" );
        
        System.out.printf( "%n%s%n%s: $%,.2f%n%n", 
            salariedEmployee, "earned", salariedEmployee.earnings() );
        System.out.printf( "%s%n%s: $%,.2f%n%n:", 
            hourlyEmployee, "earned", hourlyEmployee.earnings() );
        System.out.printf( "%s%n%s: $%,.2f%n%n", 
            commissionEmployee, "earned", commissionEmployee.earnings() );
        System.out.printf ("%s%n%s: $5,.2f%n%n", 
            basePlusCommissionEmployee, 
            "earned", basePlusCommissionEmployee.earnings() );
            
        // create four-element Employee array
        Employee[] employees = new Employee[ 4 ];
        
        // initialize array with Employees
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = baseplusCommissionEmployee2;

        System.out.printf( "Employees processed polymorphically: %n%n" );

        // generically process each element in array employees
        for ( Employee currentEmployee : employees ) {

            System.out.println( currentEmployee ); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee2
            if currentEmployee instanceof baseplusCommissionEmployee2() {

                // downcast Employee reference to
                // BasePlussCommissionEmployee2 reference
                baseplusCommissionEmployee2 employee = 
                    ( baseplusCommissionEmployee2 ) currentEmployee;

                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );    

                System.out.printf( 
                    "new base salary with 10%% increase is: $%,.2f%n", 
                    employee.getBaseSalary());

            } // end if

            System.out.printf(
                "earned $%,.2f%n%n", currentEmployee.earnings());

        } // end for

        // get type name of each object in employees array
        for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s%s", j, 
                employees[ j ].getClass().getName());

    } // end main
    
} // end class PayrollSystemTest