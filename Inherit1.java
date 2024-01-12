class Parent 
{
 int i=10;
 void meth1()
  {
   System.out.println("value of i  = "+i);
   }
 }

class Child extends Parent
 {
   void meth1()
    {
     System.out.println("value of i :=" +i);
     }
   }
   
 class Inherit1 
  {
   public static void main(String args[])
    {
      Child c=new Child();
        c.meth1();
      System.out.println(" answr is =" +c);
      }
    }
      
