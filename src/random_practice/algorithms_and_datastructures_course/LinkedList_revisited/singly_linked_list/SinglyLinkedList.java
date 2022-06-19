package random_practice.algorithms_and_datastructures_course.LinkedList_revisited.singly_linked_list;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if(head == null) System.out.println("SLL does not exist");
        else{
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if( i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public void deleteNodeOfSinglyLinkedList(int location){
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }else if(location == 0){
            //more than one element:
            head = head.next;
            size--;
            //only one element:
            if(size == 0)tail = null;
        }else if(location >= size){
            //deleting from the end of the list:
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            //one element:
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }else{
                //more than one element:
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
            // delete from a given location:
        }else{
            Node tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteEntireSinglyLinkedList(){
        head = null;
        tail = null;
        System.out.println("SLL deleted successfully");
    }

}
