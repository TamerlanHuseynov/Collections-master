package random_practice.algorithms_and_datastructures_course.LinkedList_revisited.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//        csll.createCSLL(10);
//        System.out.println("value = "+csll.head.value);
//        System.out.println("next value = "+csll.head.next.value);
//        System.out.println("next next value = "+csll.head.next.next.value);
//        System.out.println("-------------------------------------------");

        csll.insertIntoCSLL(10, 0);
        csll.insertIntoCSLL(20, 1);
        csll.insertIntoCSLL(30, 2);
        csll.insertIntoCSLL(40, 3);
        csll.insertIntoCSLL(50, 4);
        csll.insertIntoCSLL(0, 0);
        csll.insertIntoCSLL(101, 1012);
        int index = 0;
        Node node = csll.head;

        while (index < csll.size) {
            System.out.print(node.value + " --> ");
            node = node.next;
            index++;
        }

        System.out.println();
        System.out.println(csll.tail.next.value);
        System.out.println("-------------------------------------------");
        csll.traverseCSLL();
        System.out.println("-------------------------------------------");
        csll.searchCSSL_Value(101);
        csll.searchCSSL_Value(999);
        System.out.println("-------------------------------------------");

        csll.deleteNodeFromCSSL(6);
        csll.deleteNodeFromCSSL(5);
        csll.deleteNodeFromCSSL(4);
        csll.traverseCSLL();
        System.out.println("-------------------------------------------");

        csll.deleteEntireCSLL();
        csll.traverseCSLL();
    }

}
