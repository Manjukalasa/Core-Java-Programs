public class Variable 
{
     int  a; 
  public void check()
    {
        int a=100;
        System.out.println(a);
        System.out.println(new Variable().a);
    }     
public static void main(String[] args) 
{
Variable v1=new Variable();
v1.check();    
}
} 