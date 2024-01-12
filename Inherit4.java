class Parent 
  {
	   int i=10;
	   int j=20;
	  
	   void meth1() 
	    {
			 System.out.println("hiiii = "+i);
		}
		
		 void meth2() 
	    {
			 System.out.println("hiiii" );
		}
		
	
}
class Child extends Parent 
   {
	    void meth1() 
	    {
			 System.out.println("hiiii gn " +i);
		} 
 		
}
class Inherit4
 {
	  public static void main( String args[])
	   {
		    Child c=new Child();
		    c.meth1();
		    c.meth2();
		 }
}
