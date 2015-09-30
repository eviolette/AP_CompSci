import java.text.NumberFormat;
import java.util.Scanner;

public class StampATMTester 
{
    public static void header()
    {
         System.out.println("Ethan Violette");
         System.out.println("Chapter 4 Programming Exercise");
         System.out.println("Stamp ATM Machine\n");
    }
    
    public static void main() 
    {
        header();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Monetary Amount:");
        System.out.print("$");
        System.out.flush();
        double moneyEntered = in.nextDouble( ); 
        
        System.out.println("How many stamps do you want?");
        int stampsWanted = in.nextInt( );   
        
        StampATM s = new StampATM(moneyEntered, stampsWanted);
        s.subtractStamps();
        s.calcChange();
        
        
        
        outputInfo(s);
    }
    
    public static void outputInfo(StampATM s) 
    {
       System.out.println("\nYour total change is $" + s.getMoney() + "\n");
       
       System.out.println("Number of $50 bills: " + s.getFifty()); 
       System.out.println("Number of $20 bills: " + s.getTwenty()); 
       System.out.println("Number of $10 bills: " + s.getTen());
       System.out.println("Number of $5 bills: " + s.getFive()); 
       System.out.println("Number of $1 bills: " + s.getOne()); 
       System.out.println("Number of Quarters: " + s.getQuarters()); 
       System.out.println("Number of Dimes: " + s.getDimes()); 
       System.out.println("Number of Nickels: " + s.getNickels()); 
       System.out.println("Number of Pennies: " + s.getPennies()); 

    }
    

}
