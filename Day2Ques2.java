public class Main 
{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static double add(double a, double b)
    {
        return a+b;
    }
    public static String add(String a, int b)
    {
        return a+" "+b; 
    }
    public static void main (String[] args) {
       System.out.println(add(10,20));
       System.out.println(add(10,20,30));
       System.out.println(add(10.5,20.1));
       System.out.println(add("Hello",20));
        
    }
}
