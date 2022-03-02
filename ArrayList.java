import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
        ArrayList<Integer>al1=new ArrayList<>(20);//intializing arraylist with 20 but its dyanmic
        ArrayList<Integer>al2=new ArrayList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(0,5);//we are giving index here
        al1.addAll(al2);//inserting all elements of al2 to al1 
        al1.add(6,60);
        System.out.println(al1);
        System.out.println(al1.contains(50));//returns true if the element is present
        System.out.println(al1.get(5));//returns the element at that index
        System.out.println(al1.indexOf(60));//returns index of that element
        System.out.println(al1.lastIndexOf(60));
        //set method change the element at that index
        al2.set(2,180);
        System.out.println(al2);
        for(int i=0;i<al2.size();i++)//for loop
        {
            System.out.println(al2.get(i));
        }
        for(Integer x:al1)//we can use var keyword instead of mentioning the datatype of the object
        {
            System.out.print(x+" ");//for eachloop
        }
        ListIterator<Integer>it=al1.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        al1.forEach(System.out::println);//system.out is a reference
    }                                    //println is a method
    }
 
