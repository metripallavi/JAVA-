import java.util.Vector;

public class Testv1
 {
  public static void main(String args[])
  {
     Vector <String> vect1= new Vector<>();
     vect1.add("A");
     vect1.add("B");
     vect1.add(0,"C");
     
     System.out.println(vect1);
      Vector <String> vect2 = new Vector<>();
      
      vect2.addAll(vect1);
      vect1.size();
      System.out.println("size of vect 1 is " +vect1.size());
      System.out.println("Vect2: " +vect2);
      System.out.println("element value = " +vect1.get(2));
      vect1.remove(1);
      System.out.println("after removal = " +vect1);
      System.out.println("size of vector1 is "+vect1.size());
      vect2.clear();
      System.out.println("After clear Vector = "+vect2);
      System.out.println("after clearing the size of vector 2 is = " +vect2.size());
      
       
   
    }
}
