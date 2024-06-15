package DataStructure;

public class BST {
    public Node root;


    public class Node {
        public int value;
        public Node left;
        public Node right;


        public Node(int value) {
            this.value = value;
        }
    }

    //Metodo de inserir
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else{
            insert(root, value);
        }
    }
    private void insert(final Node root, final int value) {
        if (root == null) return;
        if (value == root.value) return;
        if (value > root.value) {
            if (root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new Node(value);
            else insert(root.left, value);

        }
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(final Node node){
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    //Metodo de busca
    public boolean contains(int value){
       return contains(root, value);
    }

    private boolean contains(final Node root, final int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }
    //













    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);


        System.out.println(tree.contains(11));
        System.out.println(tree.contains(99));




    //    tree.inOrder();
    }













}
