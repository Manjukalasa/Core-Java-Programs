class A
{
    int a=20;    // Non static global variables
    public void text()
    {
        System.out.println("java");
    }
}
public class NSdiffClass
{
    public static void main(String[] args) {
        new A().text();
        System.out.println(new A().a);    // new classmane.membername
    }
    
}
