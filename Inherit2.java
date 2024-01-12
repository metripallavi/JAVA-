class Parent
 {
  public int i=10;
  protected int j=20;
   
    void meth1()
     {
      System.out.println(" VALUES OF I AND J ARE = " +i +j);
     }
  }
  
  
  class Child extends Parent
   {
    void meth1()
      {
       System.out.println(" VALUES OF I is  = "  +i);
       System.out.println(" VALUES OF J is  = "  +j);
       }
     }
 class Inherit2 
  {
    public static void main(String args[])
       {
         Child x=new Child();
         x.meth1();
       
      }
   }
   
         
       
       
