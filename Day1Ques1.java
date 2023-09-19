import java.util.Scanner;

public class StrQues {
    public static String addMethod(int empno, String name, int age, String country) {
        String abc = empno + ";" + name + ";" + age + ";" + country;
        return abc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empno = sc.nextInt();
        String name = sc.nextLine();
        int age = sc.nextInt();
        String country = sc.nextLine();
        String result = "";
        result = addMethod(empno, name, age, country);
        System.out.println(result);
    }
}
