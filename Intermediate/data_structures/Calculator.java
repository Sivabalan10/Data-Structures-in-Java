import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter 1-add| 2-sub | 3-mul | 4-div | 0 - exit");
            int condition = sc.nextInt();
            sc.nextLine();

            int res = cal(a, b, condition);
            if (res == 0) {
                System.out.println("Closed");
                break;
            }
            System.out.println(res);
            System.out.println("------------------------------------");
        }
    }

    public static int cal(int a, int b, int condition) {
        switch (condition) {

            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
            case 0:
                return 0;
            default:
                return 404;

        }
    }
}