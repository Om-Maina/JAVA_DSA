package CNJava.LinkedList;

import java.util.Scanner;

public class LinkedList {
    public static Node<Integer> takeInput() {
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        while (s != -1) {
            Node<Integer> newnode = new Node<Integer>(s);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = tail.next;
            }
            s = scan.nextInt();

        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
//    public static void nthNode()

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
