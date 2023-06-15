class sample
{
   static int a=10;           //Static  global variables
   public static void text()
    {
       System.out.println("satic text() present in Different class");
   }
}
public class StaticDiffClass 
{
        public static void main(String[] args) 
    {
        sample.text();
        System.out.println(sample.a); // Static present in different class classname.membername

    }
}
