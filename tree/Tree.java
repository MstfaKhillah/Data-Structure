package tree;

public class Tree {

    public static void main(String[] args) {

        trees t = new trees();
        t.insert(100);
        t.insert(95);
        t.insert(105);
        
        System.out.println(t.find(100));
    }

}
