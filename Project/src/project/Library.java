package project;

public class Library {

    Node head;
    int capacity;

    public Library(int size) {
        this.head = null;
        this.capacity = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String name, int num) {
        Book b = new Book(name, num);
        Node newNode = new Node(b);

        newNode.next = head;
        head = newNode;
        capacity++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            Node p = head.next;
            capacity--;
            head = head.next;
        }

    }

    public void search(String name) {
        Node a = head;
        int key = 0;
        if (isEmpty()) {
            System.out.println("Stack Is Empty");
        } else {
            while (a != null) {
                if (a.book.bookName.equalsIgnoreCase(name)) {
                    key = 1;
                }
                a = a.next;
            }

        }
        if (key == 1) {
            System.out.println("Found");
        } else {
            System.out.println("not found");
        }
    }

    public void Sort() {
        Node curr = head;
        Node index;
        Book temp;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            while (curr != null) {
                index = curr.next;
                while (index != null) {

                    if (curr.book.bookID > index.book.bookID) {
                        temp = curr.book;
                        curr.book = index.book;
                        index.book = temp;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }

    }

    public void print() {
        Node p = head;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        while (p != null) {
            System.out.print("Book Name: " + p.book.bookName + " | ");
            System.out.println("Book Number: " + p.book.bookID);
            p = p.next;
        }
    }

}
