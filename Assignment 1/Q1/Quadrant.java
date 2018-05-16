//Java Program to find position of co-ordinates in 2d plane

public class Quadrant
{
    double x,y;
    
    public Quadrant()
    {
       x=0.0;
       y=0.0;
    }

    public int findQuadrant()
    {
        if(x==0.0)
        {
            if(y==0.0)
                return 0;   //point at origin
            else
                return -2;  //point on y-axis
        }
        else if(y==0.0)
            return -1;  //point on x-axis
            
        if(x>0)
        {
            if(y>0)
                return 1;   //1st Quadrant
            else
                return 4;   //4th Quadrant
        }
        else
        {
            if(y>0)
                return 2;   //2nd Quadrant
            else
                return 3;   //3rd Quadrant
        }
    }
    
    public void getQuadrant(double x,double y)
    {
        this.x=x;
        this.y=y;
        
        System.out.printf("The Co-ordinates (%f,%f) lie ",x,y);
        if(findQuadrant()==0)
            System.out.print("on origin");
        else if(findQuadrant()==-1)
            System.out.print("on X-axis");
        else if(findQuadrant()==-2)
            System.out.print("on Y-axis");
        else
            System.out.print("in Quadrant: "+findQuadrant());
    }
    
}
