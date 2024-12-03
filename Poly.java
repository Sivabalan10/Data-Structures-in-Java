public class Poly {
    public static void main(String[] args) {
        int cust_1 = pack(4, 10);
        int cust_2 = pack(10, 14, 18);
        System.out.println("Customer_1 :" + cust_1 + "\n" + "Customer_2 :" + cust_2);
        // Just for reference in case, without static method we have to create obj to
        // access!
        Poly m = new Poly();
        m.pack();
    }

    public static int pack(int user1, int user2) {
        return user1 + user2;
    }

    public static int pack(int user1, int user2, int user3) {
        return user1 + user2 + user3;
    }

    public void pack() {
        System.out.println("No package selected!");
    }
}
