public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insertAtStart(5);
        list.insertAtEnd(50); // no use of this function, just for understanding how it works

        list.insertAt(2,15);
        
        
        
        list.deleteAtStart();
        list.deleteAt(2);

        list.show();
        int len = list.size();
        System.out.println("Size of list "+len);
    }
}
