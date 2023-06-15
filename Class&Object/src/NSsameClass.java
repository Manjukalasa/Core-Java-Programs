public class NSsameClass
{
    public void text1()
    {
        System.out.println("text() Non static");
    }
    public void count()
    {
        System.out.println("count() Non static");
        text1();
    }
    public static void main(String[] args) {
      new  NSsameClass().count();     // new classmane.membername
    }   
}
