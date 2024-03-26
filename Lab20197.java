

public class Lab20197 {
    public static void main(String[] args) {
        Binarytree bt = new Binarytree();

        bt.add(6);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(4);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(8);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(3);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(5);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(7);
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.add(9);
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.print("max = ");
        System.out.println(bt.findMax(bt.root));
        System.out.print("min = ");
        System.out.println(bt.findMin(bt.root));
    }    
}
