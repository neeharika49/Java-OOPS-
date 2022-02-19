class Rectangle
{
    private double length;
    private double breadth;
    
    public double getlength()
    {
        return length;
    }
    public double getbreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {  
        if(l>0)
           length=l;
        else
        length=0;
    }
    public void setBreadth(double b)
    { 
        if(b>0)
           breadth=b;
        else
        breadth=0;
    }
    
    public  double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length==breadth)
          return true;
          else 
          return false;
    }
}
public class Main {
    public static void main(String args[]) {
     Rectangle r1=new Rectangle();
     r1.setLength(2);
    r1.setBreadth(5);
      System.out.println("area:"+r1.area());
       System.out.println("perimeter:"+r1.perimeter());
       System.out.println("square:"+r1.isSquare());
    }
}
