public class IceCreamCone{
    
    private double radius;
    private double height;
    
    public IceCreamCone(){
        radius = 0;
        height = 0;
    }
    
    public IceCreamCone(double h, double r) {
        radius = r;
        height = h;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getSurfaceArea()
    {
        double hypHeight = Math.sqrt((Math.pow(radius, 2)) + (Math.pow(height, 2)));
        double surfArea = ((2 * Math.PI * (Math.pow(radius, 2))) + Math.PI * radius * hypHeight);
        surfArea = Math.round((surfArea*1000))/1000.0;
        return surfArea;
    }
    
    public double getVolume()
    {
        double  vol = ((1.0/3.0) * Math.PI * Math.pow(radius, 2) * height) + ((2.0/3.0) * Math.PI * Math.pow(radius, 3));
        vol = Math.round((vol*1000))/1000.0;
        return vol;
    }
}