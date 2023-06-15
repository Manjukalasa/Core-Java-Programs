public class StaticSameClass
 {
    static int a=20;           // global variables
    public static void text()
     {
        System.out.println("satic text() present in same class");
    }
    public static void main(String[] args) 
    {
        text();
        System.out.println(a);   // same class only memberName

    }
}
