package CNJava.LinkedList;

import java.util.Scanner;

public class LengthLL {
    public static Node<Integer> takeinput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        while (s != -1){
            Node<Integer> newnode = new Node<Integer>(s);
            if ( head == null){
                head = newnode;
                tail = newnode;

            }else {
                tail.next = newnode;
                tail = tail.next;
            }
            s = scan.nextInt();
        }
        return head;
    }
    public static int length(Node<Integer> head){
        int count = 0;
        while(head != null){
            head =  head.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeinput();
        System.out.println(length(head));
    }

}
