import java.text.NumberFormat;
import java.util.Scanner;				

public class InputTester{
     public static void main( )
     {
    	NumberFormat formatter = NumberFormat.getNumberInstance( );	//This might seem a bit cumbersome..	
    	formatter.setMinimumFractionDigits(2);				//But it’s a simple cut & paste!
    	formatter.setMaximumFractionDigits(2);

        final double TAX_RATE = 8.5;

        Scanner in = new Scanner(System.in);		
        System.out.println("Enter Sales Amount $");			// Input 25.50
		
        double sales = in.nextDouble( );			
		double tax = sales * TAX_RATE / 100;
		
		System.out.println("Sales:\t$" +formatter.format(sales));		//Output:	Sales: 	$25.50
		System.out.println("Tax\t$" + formatter.format(tax));			//		Tax: 	$2.17
      }
}
