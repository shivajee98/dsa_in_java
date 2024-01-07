class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public void append(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        while(head.next != null){
            head = head.next;
        }
        newNode.next = null;
        head.next = newNode;
    }
    public void insertInBetween(Node index, int data) {
        Node newNode = new Node(data);
        while (head.next != index) {
                head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
        return;
    }
    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }
}
public class linkedListCreation {
    public static void main(String [] args){
        LinkedList myList = new LinkedList();
        myList.append(3);
        myList.append(5);
        myList.append(4);
        myList.printList();
//        myList.insertAtBegining(45);
        System.out.println();
        myList.printList();
//        myList.insertAtEnd(89);
//        myList.insertInBetween(3, 67);
        myList.printList();
        System.out.println("************************");
        myList.reverseList();
        myList.printList();
    }
}