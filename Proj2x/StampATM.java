public class StampATM
{
   private double money;
   private double moneyRem;
   
   private double numFifty;
   private double numTwenty;
   private double numTen;
   private double numFive;
   private double numOne;
   private double numQuarters;
   private double numDimes;
   private double numNickels;
   private double numPennies;
   
   private int numStamps;
   
   private static final double STAMP_COST = 0.49;
    
   private static final int FIFTY = 5000;
   private static final int TWENTY = 2000;
   private static final int TEN = 1000;
   private static final int FIVE = 500;
   private static final int ONE = 100;
   private static final int QUARTER = 25;
   private static final int DIME = 10;
   private static final int NICKEL = 5;
   private static final int PENNY = 1;
   
   public StampATM() {
       money = 0;
       numStamps = 0;
   }
   
   public StampATM(double amt,int num) {
       money = amt;
       numStamps = num;
   }
   
   public double getMoney() {
       return money;
   }
   
   public void subtractStamps() {
       money -= numStamps * StampATM.STAMP_COST;
   }
   
   public void calcChange() { 
       moneyRem = money * 100;
       numFifty = Math.floor(moneyRem / FIFTY);
       moneyRem = moneyRem - (numFifty * FIFTY);
       
       numTwenty = Math.floor(moneyRem / TWENTY);
       moneyRem = moneyRem - (numTwenty * TWENTY);
       
       numTen = Math.floor(moneyRem / TEN);
       moneyRem = moneyRem - (numTen * TEN);
       
       numFive = Math.floor(moneyRem / FIVE);
       moneyRem = moneyRem - (numFive * FIVE);
       
       numOne = Math.floor(moneyRem / ONE);
       moneyRem = moneyRem - (numOne * ONE);
       
       numQuarters = Math.floor(moneyRem / QUARTER);
       moneyRem = moneyRem - (numQuarters * QUARTER);
       
       numDimes = Math.floor(moneyRem / DIME);
       moneyRem = moneyRem - (numDimes * DIME);
       
       numNickels = Math.floor(moneyRem / NICKEL);
       moneyRem = moneyRem - (numNickels * NICKEL);
       
       numPennies = Math.floor(moneyRem / PENNY);
       moneyRem = moneyRem - (numPennies * PENNY);
       
   }
   
   public int getFifty() {
       return (int)numFifty;
   }
   
   public int getTwenty() {
       return (int)numTwenty;
   }
   
   public int getTen() {
       return (int)numTen;
   }
   
   public int getFive() {
       return (int)numFive;
   }
   
   public int getOne() {
       return (int)numOne;
   }
   
   public int getQuarters() {
       return (int)numQuarters;
   }
   
   public int getDimes() {
       return (int)numDimes;
   }
   
   public int getNickels() {
       return (int)numNickels;
   }
   
   public int getPennies() {
       return (int)numPennies;
   }
   
   
}
