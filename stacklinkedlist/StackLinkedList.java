package stacklinkedlist;

public class StackLinkedList {

    public static void main(String[] args) {
        LinkedStack l1 = new LinkedStack(3);

        l1.push(5);
        l1.push(2);
        l1.push(3);
        l1.push(4);

        l1.pop();
        l1.print();
        
        System.out.println("Size Of Stack: " + l1.size());
//        System.err.println("Is Full? " + l1.isFull());
        System.out.println("Is Empty? " + l1.isEmpty());
    }

}
