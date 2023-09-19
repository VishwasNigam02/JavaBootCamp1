public class SumQues {
    public int sumMethod(int a, int b, int c) {
        int sum = 0;
        if (a >= b && a <= c)
            sum = b + c;
        if (b >= a && b <= c)
            sum = a + c;
        if (c >= b && c <= a)
            sum = b + a;
        return sum;
    }

}
