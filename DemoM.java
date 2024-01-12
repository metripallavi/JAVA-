import java.util.Scanner;
class Input
 {
  int a,b;
  public void accept()
   {
    System.out.println("enter a b value");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
   }
 }
 class Cal extends Input
  {
   int c;
   public void add()
    {
     c=a+b;
     }
   public void display()
     {
      System.out.println("a is = "+a + "b is = " +b);
      }
     }
  class Output extends Cal
   {
   public void display() 
     {
      System.out.println("value of addition of a and b is c="+c);
      }
     }
      
      
    class DemoM
   {
    public static void main(String args[])
     {
      Output x=new Output();
      x.accept();
      x.add();
      x.display();
      
     }
   }
   
