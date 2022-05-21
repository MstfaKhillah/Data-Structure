package stacklinkedlist;

public class LinkedStack {

    Node top;
    int capacity;

    public LinkedStack(int size) {
        this.top = null;
        this.capacity = 0;
    }

    public boolean isFull() {

        return capacity == size();

    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int item) {
        Node n = new Node(item);
        if (n == null) {
            System.err.println("Stack is Full");
        } else {
            n.item = item;
            n.next = top;
            top = n;
            capacity++;
        }
    }

    public void pop() {
       
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            int t = top.item;
            capacity--;
            top = top.next;
     
        }
    }

    public int size() {
        return capacity;
    }

    public void print() {
        Node p = top;
        while (p != null) {
            System.out.println(p.item);
            p = p.next;
        }
    }
    
}
