public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int res = factorial(n);
        System.out.println("Result: " + res);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
