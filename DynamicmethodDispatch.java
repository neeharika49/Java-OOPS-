class Super
{
    public void meth1()
    {
        System.out.println("super method1");
    }
    public void meth2()
    {
        System.out.println("super method2");
    }
}
class Sub extends Super
{   @Override
    public void meth2()
    {
        System.out.println("sub method2");
        
    }
    public void meth3()
    {
        System.out.println("method3");
    }
}

public class Main {
    public static void main(String args[]) {
      Super s=new Sub();//method of object is called 
      s.meth1();
      s.meth2();
      s.meth3();//method which is not present reference class cannot be called
      
    }
}
