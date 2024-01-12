import java.util.Scanner;
class Input
 {
  int a,b;
  public void acceot()
   {
    System.out.println("enter a b value");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nectInt();
   }
 }
 class cal extends Input
  {
   int c;
   public void add()
    {
     c=a+b;
     }
   public void display()
     {
      System.out.println("a="+a+"b="+b);
      }
     }
  class Output extends Cal
   {
    public void display() 
     {
      System.out.println("c="+c);
      }
     }
      
      
    class DemoMultilevel 
   {
    public static void main(String args[])
     {
      Output x=new Output();
      x.accept();
      x.add();
      x.display();
      
     }
   }
   
