import java.util.Scanner;
class Student
 {
  int rollno;
  String name;
  
  public void accept()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter stduent name and roll number");
   name=sc.next();
   rollno=sc.nextInt();
  }
  
  public void add()
  {
   System.out.println("name is " +name);
   System.out.println("roll is "+rollno);
  }
  
public static void main(String args[])
{
 
 Student s=new Student();
 s.accept();
 s.add();
 
 }
} 
