class Parent 
 {
  int i=10;
 private int  j=20;
  
  void meth1()
  {
   System.out.println("value of i is = " +i);
   }
 }
class Child extends Parent 
 {
	  void meth1()
	   {
		   System.out.println("i value is " +i +j);
       }
   }
class Inherit3
  {
	    public static void main ( String args[])
	     {
			  Child c=new Child();
			  c.meth1();
		}
		
}
 
