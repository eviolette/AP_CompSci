import java.util.Scanner;                   //Import the following package.

public class ConsoleInputEx {
    public static void main() {
        final double TAX_RATE = 7.5;
        
        Scanner in = new Scanner(System.in);        //Create a new Scanner Object.
        
        System.out.print("Enter Full Name: ");       //Print an input prompt.  
        String name = in.nextLine( );           //Reads entire line including <eoln> aka <return>
        
        System.out.print("Enter Age: ");          
        int age  = in.nextInt( );               //integer input
        
        System.out.print("Enter GPA: ");          
        double gpa = in.nextDouble( );         //double input
        
        System.out.print("Enter Full Name: ");      //Be careful when reading word by word for <eoln>  
        String fName = in.next ( );
        String lName = in.next ( );             //not what you would expect!
        
        System.out.println("\nFirst Name: " + fName + "\nLast Name: " + lName);
        System.out.println("Age: " + age + "\nGPA = " + gpa);
        System.out.println("Full Name is: " + name);
        
    }
}
           