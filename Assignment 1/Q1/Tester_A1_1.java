//Tester for class Quadrant

public class Tester_A1_1
{
    public static void main(String[] args)
    {
        Quadrant obj = new Quadrant();
        
        System.out.println("\nExpected: origin");
        obj.getQuadrant(0,0);
        
        System.out.println("\nExpected: x-axis");
        obj.getQuadrant(2.1,0.0);
        
        System.out.println("\nExpected: y-axis");
        obj.getQuadrant(0,10);
        
        System.out.println("\nExpected: 1");
        obj.getQuadrant(1.0,0.5);
        
        System.out.println("\nExpected: 2");
        obj.getQuadrant(-5.4,2.5);
        
        System.out.println("\nExpected: 3");
        obj.getQuadrant(-200,-330);
        
        System.out.println("\nExpected: 4");
        obj.getQuadrant(5.2,-45.256);
    }
}
        
        