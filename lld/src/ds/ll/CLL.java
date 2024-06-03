package ds.ll;

import java.util.LinkedList;

/**
 * add first
 * add last
 * delete first
 * delete last
 * delete by index
 * get by index
 * add by the index
 */
public class CLL {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            size++;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public void addFirst(int data) {
        head = new Node(data, head);
        if (tail == null) {
            tail = head;
        }
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteByIndex(int index) {
        Node node = nodeByIndex(index - 1);
        Node next = node.next.next;
        node.next = next;
    }

    public void addByIndex(int data, int index) {
        if (index==0) {
            addFirst(data);
        }
        if (index==size) {
            addLast(data);
        }
        Node node = nodeByIndex(index);
        node.next = new Node(data, node.next);

    }

    public int getByObject(int value) {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            if (temp.data == value) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node node = nodeByIndex(size - 2);
        node.next = null;
        tail = node;
    }

    public int get(int index) {
        if (head == null || index == size) {
            System.out.println("List is empty");
            throw new IllegalArgumentException("Invalid argument");
        }
        Node node = nodeByIndex(index);
        return node.data;
    }

    Node nodeByIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addLast(int data) {
        if (tail == null) {
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        CLL cll = new CLL();
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);
        cll.addLast(50);
        cll.display();
        cll.addByIndex(100, 3);
        cll.display();
        System.out.println("Deleting first element from Linked List");
        cll.deleteFirst();
        cll.display();
        cll.deleteLast();
        System.out.println("Deleting last element from Linked List");
        cll.deleteLast();
        cll.display();



    }
}
