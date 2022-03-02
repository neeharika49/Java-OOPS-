abstract class My
{
    abstract  void show();
}
class Outer
{
    public void display()
    {
        My m=new My()//anonymous object and anynoymoous class i.e inheriting from class my
        {
            public void show()
            {
                System.out.println("hello");//override the abstract method
            }
        };
        m.show();//calling the method inside the class
    }
}
public class MyClass {
    public static void main(String args[]) {
      Outer o=new Outer();
      o.display();

      
    }
}
