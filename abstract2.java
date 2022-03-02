abstract class Shape
{ 
    
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape
{
    int radius;
    public void area()
    {
        System.out.println("area :"+Math.PI*radius*radius);
    }
    public void perimeter()
    {
        System.out.println("Circumference :"+2*Math.PI*radius);
    }
    
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    public void area()
    {
        System.out.println("area:"+length*breadth);
    }
    public void perimeter()
    {
        System.out.println("perimeter :"+2*(length+breadth));
    }
}


public class MyClass {
    public static void main(String args[]) {
      Rectangle r=new Rectangle();
      r.length=10;
      r.breadth=5;
      Shape s=r;
 s.area();
      
    }
}
