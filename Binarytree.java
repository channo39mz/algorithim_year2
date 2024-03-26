public class Binarytree {
    Node root;
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
    
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;
 
        int res = node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
 
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    public int findMin(Node node)
    {
        if (node == null)
            return Integer.MAX_VALUE;
    
        int res = node.value;
        int lres = findMin(node.left);
        int rres = findMin(node.right);
    
        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }
}
