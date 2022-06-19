package random_practice.algorithms_and_datastructures_course.LinkedList_revisited.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        System.out.println("old head = "+sll.head.value);
        sll.insertInLinkedList(10,0);
        System.out.println("new head = "+sll.head.value);
        System.out.println("second element = "+sll.head.next.value);

        sll.createSinglyLinkedList(1);
        sll.insertInLinkedList(2,1);
        sll.insertInLinkedList(3,2);
        sll.insertInLinkedList(4,3);
        sll.insertInLinkedList(5,4);
        sll.insertInLinkedList(6,5);
        sll.insertInLinkedList(9,6);
        sll.traverseSinglyLinkedList();

        sll.deleteNodeOfSinglyLinkedList(2);
        sll.deleteNodeOfSinglyLinkedList(2);
        sll.traverseSinglyLinkedList();

        sll.deleteEntireSinglyLinkedList();
        sll.traverseSinglyLinkedList();
    }

}
