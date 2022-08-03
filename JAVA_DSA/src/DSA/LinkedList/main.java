package DSA.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertlast(4);
        list.insertFirst(5);
        list.insertlast(6);
        list.insertlast(7);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deletFirst());
        list.display();
        System.out.println(list.delectlast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(3));
        list.find(4);
        list.insertRec(88,2);
        list.display();

//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertLast(99);
//        list.insert(2,69);
//        list.display();

//        CircularLinkedList list = new CircularLinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.delete(3);
//        list.display();


    }
}
