abstract class Super//object of abstract class cannot be instantiated
{
    public Super()
    {
        System.out.println("Super Constructor");
        
    }
    public void meth1()
    {
        System.out.println("Meth 1 constructor");
    }
    abstract public void meth2();//meth withoout a body is abstract method
    
}

class Sub extends Super//concrete ckass
{
    @Override
    public void meth2()
    {
      System.out.println("Sub meth2");  
    }
}

public class Main {
    public static void main(String args[]) {
      Super s=new Sub();//object of Sub class is created with super class reference
s.meth1();
s.meth2();
      
    }
}
