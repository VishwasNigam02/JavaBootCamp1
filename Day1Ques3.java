import java.util.Scanner;

public class NumName {
    public static String name(int n) {
        if (n == 0) {
            return "Zero ";
        }
        if (n == 1) {
            return "One ";
        }
        if (n == 2) {
            return "Two ";
        }
        if (n == 3) {
            return "Three ";
        }
        if (n == 4) {
            return "Four ";
        }
        if (n == 5) {
            return "Five ";
        }
        if (n == 6) {
            return "Six ";
        }
        if (n == 7) {
            return "Seven ";
        }
        if (n == 8) {
            return "Eight ";
        }
        if (n == 9) {
            return "Nine ";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res = "";
        for (int i = 0; i < 3; i++) {
            res = name(a % 10) + res;
            a = a / 10;
        }
        System.out.println(res);
    }
}

