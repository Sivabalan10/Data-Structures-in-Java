public class App {
    public static void main(String args[]) {
        // data types
        int n = 10;
        double price = 10.99;
        char g = 'S';
        boolean status = true;
        if (status == true) {
            System.out.println(g + ":" + price * n);
        }
        String name = "Sivabalan";
        int[] val = { 1, 2, 3, 4, 5, 6 };
        System.out.println(name.toUpperCase() + ":" + val[5]);

        // Methods
        double acc = Math.accuracy(45, 100);
        System.out.println(acc);

        // String Operation
        String name2 = "Sivabalan";
        int namelen = name2.length();
        for (int i = 0; i < namelen; i++) {
            System.out.println(name2.charAt(i));
        }
    }

}