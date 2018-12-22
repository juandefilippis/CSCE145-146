//Written by Juan De Filippis
public class BSTreeFruit <T extends Comparable <T> > {

    private class Node {

        private T data;
        private Node LeftChild;
        private Node RightChild;

        public Node(T aData) {
            data = aData;
            LeftChild = RightChild = null;
        }
    }

    private Node root;

    public BSTreeFruit() {
        root = null;
    }

    public void insert(T aData) {

        if (root == null) root = new Node(aData);
        else insert(root, aData);
    }

    private Node insert(Node aNode, T aData) {

        if (aNode == null) aNode = new Node(aData);
        else if (aData.compareTo(aNode.data) < 0) {
            aNode.LeftChild = insert(aNode.LeftChild, aData);
        } else if (aData.compareTo(aNode.data) >= 0) {
            aNode.RightChild = insert(aNode.RightChild, aData);
        }

        return aNode;
    }

    public void printPreOrder() {

        printPreOrder(root);
    }

    private void printPreOrder(Node aNode) {

        if (aNode == null) return;
        System.out.println(aNode.data);
        printPreOrder(aNode.LeftChild);
        printPreOrder(aNode.RightChild);
    }


    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node aNode) {

        if (aNode == null) return;

        printInOrder(aNode.LeftChild);
        System.out.println(aNode.data);
        printInOrder(aNode.RightChild);

    }

    private Node deleteMin(Node aNode) {
        if (aNode == null) return null;
        if (aNode.LeftChild == null)// found smallest node... kill it
            return aNode.RightChild;
        aNode.LeftChild = deleteMin(aNode.LeftChild);
        return aNode;
    }

    private Node findMax(Node aNode) {
        if (aNode == null) return null;
        if (aNode.LeftChild == null) return aNode;
        else return findMax(aNode.LeftChild);
    }

    public void printPostOrder() {


    }

    public void delete(T aData) {


    }
}



