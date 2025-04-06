public class LinkedList {
    Node head;

    // insert function
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    // insert at the start
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    // insert at the end
    public void insertAtEnd(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        n.next = node;
    }

    // insert at given index
    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        // exceed size case, then throw an error indicator
        else if(index >= size()){
            System.out.println("InsertAt "+index+" is failed due to size exceed");
        }
        else{
            Node n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    // delete functions
    // delete at the start
    public void deleteAtStart(){
        Node n = head;
        head = n.next;
        n.next = null; // garbage collector will handle this
        System.out.println("Deleted at start "+n.data);
    }

    // delete at particular index
    public void deleteAt(int index){
        Node n = head;
        if(index == 0){
            deleteAtStart();
        }
        else if(index >= size()){
            System.out.println("DeleteAt "+index+" is failed due to size exceed");
        }
        else{
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            Node temp = n.next;
            n.next = temp.next;
            temp.next = null; // garbage collector will remove this
            System.out.println("Deleted value "+temp.data);
        }
    }

    // size function
    public int size(){
        Node n = head;
        int count_size = 0;
        while(n!=null){
            n = n.next;
            count_size++;
        }
        return count_size;
    }
    
    // show function
    public void show(){
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    } 


}
