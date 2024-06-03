package ds.ll;

public class LL {
    private Node head;
    // if you want to insert into last get it done in O(1)
    private Node tail;
    private int size;

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // O(1)
    public void addFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // O(1)
    public void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(int value, int index) {
        if (index < 0 && index > size) {
            throw new IllegalArgumentException("Incorrect index " + index);
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
    }


    public int size() {
        return size;
    }

    public static void main(String[] args) {

        LL ll = new LL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(5);
        System.out.println(ll.size());
        ll.display();
        ll.add(12, 3);
        System.out.println();

        ll.display();
        ll.deleteFirst();
        System.out.println();
        ll.display();

    }
}
