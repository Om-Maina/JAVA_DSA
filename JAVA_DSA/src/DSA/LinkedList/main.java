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
//        System.out.println(list.find(3));
        list.find(4);
    }
}
