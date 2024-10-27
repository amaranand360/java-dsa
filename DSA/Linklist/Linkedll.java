
public class Linkedll {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Linkedll insert(Linkedll list, int data) {
        Node new_node = new Node(data); 
        if (list.head != null) {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        else {
            list.head = new_node;
        }
       return list;
    }

    public static Linkedll insertfirst(Linkedll list, int data) {
        Node new_node = new Node(data); 
       
        if (list.head != null) {
            Node temp = list.head;
            new_node.next = temp;
            list.head = new_node;
        }
        else {
            list.head = new_node;
        }
       return list;
    }

    public static Linkedll insertAtPos(Linkedll list, int data,int pos) {
        Node new_node = new Node(data); 
        Node temp = list.head;
        pos = pos-2;
        if (list.head != null) {
            while (pos != 0) {
                temp = temp.next;
                pos--;
            }
            new_node.next = temp.next;
            temp.next = new_node;
        }
        else {
            list.head = new_node;
        }
       return list;
    }

    public static Linkedll deletefirst(Linkedll list) {

        if (list.head != null) {
            Node temp = list.head;
            list.head = list.head.next;
            temp = null; //needed for garbage
        }
        else {
            System.out.println("List is empty. Cannot delete first element.");
        }
       return list;
    }

    public static Linkedll deleteEnd(Linkedll list) {

        if (list.head != null) {
            Node temp = list.head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        else {
            System.out.println("List is empty. Cannot delete first element.");
        }
       return list;
    }
    

    public static void printList(Linkedll list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.println(currNode.data + " -> " + currNode.next);
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linkedll list = new Linkedll();
        list = insert(list, 56); 
        list = insert(list, 64); 
        list = deletefirst(list);
        list = insertfirst(list, 70);
        list = insert(list, 30);
        list = insert(list, 40);
        list = deleteEnd(list);

        printList(list);
    }
}
