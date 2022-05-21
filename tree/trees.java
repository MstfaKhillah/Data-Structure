package tree;

public class trees {

    Node root;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data > current.data) {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                } else {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(int searchKey) {
        Node current = root;
        while (current.data != searchKey) {
            // Move current to left or right
            if (searchKey > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
            // if not found
            if (current == null) {
                return false;
            }
        }
        return true;
    }
    
//    public int getMax(){
//        Node current = root;
//    }

}
