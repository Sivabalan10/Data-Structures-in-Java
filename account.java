public class account {
    public static void main(String[] args) {
        Session client = new Session("Siua", "admn123");
        client.Submit();
        String status = client.session();
        System.out.println(status);

        // difference between == and equals
        String a = "10";
        String b = new String("10"); // to avoid string pooling and create memory in heap
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}