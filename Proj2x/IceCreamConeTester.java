public class IceCreamConeTester 
{
    public static void header()
    {
         System.out.println("Ethan Violette");
         System.out.println("p194 P4.3");
         System.out.println("Ice Cream Cone information\n");
    }
    
    public static void main() 
    {
        IceCreamCone c = new IceCreamCone(5, 3);
        
        outputInfo(c);
    }
    
    public static void outputInfo(IceCreamCone c) 
    {
       header();
       System.out.println("An ice cream cone with radius " + c.getRadius() + " and height " + c.getHeight() + " has a volume of " + c.getVolume() + " and a surface area of " + c.getSurfaceArea());

    }
}