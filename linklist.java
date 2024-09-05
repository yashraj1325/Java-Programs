class Node {
    int data;
    Node next;

    // Constructor to initialize the node's data and next pointer
    public Node(int data) {
        this.data = data;
        this.next = null;
        Node data1 = new Node(1);
        Node data2 = new Node(2);
        Node data3 = new Node(5);
        Node data4 = new Node(8);
        Node data5 = new Node(9);
        System.out.println("value is"+data1.data);
        
    }
}

class LinkedList {
    Node head;

    // Constructor to initialize the LinkedList
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to display the LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the LinkedList
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> null
    }


}