package classes_and_objects_deeper_look;
// Fig. 8.13: Employee2Test.java
// static member demonstration.

public class Employee2Test {

    public static void main  (String[] args ) {

        // show that count is 0 before creating Employees2
        System.out.printf( "Employees2 before instantiation: %d%n", 
            Employee2.getCount() );

        // create two Employees2; count should be 2
        Employee2 e1 = new Employee2( "Susan", "Baker" );
        // Employee e2 = new Employee2( "Bob", "Blue" );
        
        // show that count is 2 after creating two Employees2
        System.out.printf( "%nEmployees2 after instantiation:%n" );
        System.out.printf( "via e1.getCount(): %d%n", e1.getCount() );
        // System.out.printf( "via e2.getCount(): %d%n", e2.getCount() );
        System.out.printf( "via Employee2.getCount(): %d%n", 
            Employee2.getCount() );

        // get names of Employees2
        System.out.printf( "%nEmployee2 1: %s %s%n", 
            e1.getFirstName(), e1.getLastName() );
            // e2.getFirstName(), e2.getLastName() );    
        
    }
    
} // end class Employee2Test
