class Demosti
{
 String s1,s2;
 public void update()
  {
    s1="SITA";
   }
   
   public void change()
    {
     s2=s1.replace("SITA","MITAA");
     System.out.println(s1);
     System.out.println("AFTER REPLACING THE STRING  IS =" +s2);
     }
 
  public static void main (String args[])
  {
    Demosti d= new Demosti();
    d.update();
    d.change();
    }
   }
