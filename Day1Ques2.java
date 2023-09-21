import java.util.*;
public class Main {
    public static int sumMethod(int a, int b, int c) {
        int sum = 0;
        if (a >= b && a <= c || a >= c && a <= b)
            sum = b + c;
        if (b >= a && b <= c || b >= c && b <= a)
            sum = a + c;
        if (c >= b && c <= a || c >= a && c <= b)
            sum = b + a;
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(sumMethod(a,b,c));
        
    }
}
