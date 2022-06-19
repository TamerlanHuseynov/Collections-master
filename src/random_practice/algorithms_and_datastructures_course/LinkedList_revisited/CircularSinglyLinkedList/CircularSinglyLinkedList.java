package random_practice.algorithms_and_datastructures_course.LinkedList_revisited.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertIntoCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
            size++;
        } else if (location >= size) {
            // no clue if it works :D
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
            size++;
        }
    }

    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) System.out.print(" --> ");
                tempNode = tempNode.next;
            }
            System.out.println();
        } else System.out.println("CSLL does not exist");
    }

    public boolean searchCSSL_Value(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("CSSL does not exist!");
        }
        System.out.println("Node not found!");
        return false;
    }

    public void deleteNodeFromCSSL(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    public void deleteEntireCSLL(){
        if(head == null){
            System.out.println("The SCLL does not exist!");
            return;
        }
        head = null;
        tail.next = null;
        tail = null;
        System.out.println("The SCLL has been deleted!");
    }


}
