public class Main 
{
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void add(double a, double b)
    {
        System.out.println(a+b);
    }
    public static void add(float a, float b)
    {
        System.out.println(a+b); 
    }
    public static void add(short a, short b)
    {
        System.out.println(a+b);
    }
    public static void main (String[] args) {
        add(2,3);
        add(2.0,3.0);
        add(2.0f,3.0f);
        add((short)2,(short)3);
        
    }
}
