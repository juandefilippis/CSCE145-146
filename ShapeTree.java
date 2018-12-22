/**
Wrtiten by Juan De Filippis
 */
public class ShapeTree<T extends ShapeInterface> 
{
    private class Node
      {
  
  private ShapeInterface data;
  private Node leftChild;
  private Node rightChild;
  
  public Node(ShapeInterface aData)  
  {
   
      data = aData;
      leftChild = rightChild = null;
  }
 }
    private Node root;
 
   public ShapeTree() 
 {
    root = null;
 }
 public void insert(ShapeInterface aData) {
  
  if(root == null)
   root = new Node(aData);
  else
   insert(root,aData);
 }
 private Node insert(Node aNode,ShapeInterface aData) {
  
  if(aNode == null)//Found a leaf
   aNode = new Node(aData);
  else if(aData.getArea()<aNode.data.getArea())//Go left since it's less than zero
   aNode.leftChild = insert(aNode.leftChild, aData);
  else if(aData.getArea()>=aNode.data.getArea())//Go right since it's greater than zero
   aNode.rightChild = insert(aNode.rightChild, aData);
  return aNode;
 }
 public void printPreOrder() {
  
  printInOrder(root);
 }
 private void printPreOrder(Node aNode) {
  
  if(aNode == null)//hit a leaf
   return;
  System.out.println(aNode.data);//Access the node
  printPreOrder(aNode.leftChild);//Go Left
  printPreOrder(aNode.rightChild);//Go Right... This prints in order
  //post order traversals actually do the following... left, right, then access. The above is pre or in order.
 }
 public void printInOrder() {
  printInOrder(root);
 }
 private void printInOrder(Node aNode) {
  
  if(aNode == null)//hit a leaf
   return;
  printInOrder(aNode.leftChild);//Go Left
  System.out.println(aNode.data);//Access the node
  printInOrder(aNode.rightChild);//Go Right... This prints in order
  //post order traversals actually do the following... left, right, then access. The above is pre or in order.
 }
 public void printPostOrder() {
  printPostOrder(root);
 }
 private void printPostOrder(Node aNode) {
  
  if(aNode == null)//hit a leaf
   return;
  printPostOrder(aNode.leftChild);//Go Left
  printPostOrder(aNode.rightChild);//Go Right... This prints in order
  //post order traversals actually do the following... left, right, then access. The above is pre or in order.
  System.out.println(aNode.data);//Access the node
 }
 public void delete(double aData) {
  
  root = delete(root, aData);
 }
 //overloading delete
 private Node delete(Node aNode, double aData) {
  
  // Find the value
  if(aNode == null)//the value (aData) isn't found
   return null;
  if(aData<aNode.data.getArea())// Go left
   aNode.leftChild = delete(aNode.leftChild, aData);
  else if(aData>aNode.data.getArea())// Go right
   aNode.rightChild = delete(aNode.rightChild, aData);
  else {// We found it, kill it!
   
   // We may or may not have a left child so whatever just return it
   if(aNode.rightChild == null)
    return aNode.leftChild;
   // We do have a right child but do not have a left
   if(aNode.leftChild == null)
    return aNode.rightChild;
   // We have two kids....
   Node temp = aNode; // temp points to the node we are deleting
   //Point aNode to the smallest value in the right subtree
   aNode = findMinInTree(aNode.rightChild);
   // delete smallest element from right subtree
   aNode.rightChild = deleteMinFromTree(temp.rightChild);
   aNode.leftChild = temp.leftChild;
  }
  return aNode;
 }
 public double maxArea() {
  return maxArea(root);
 }
 private double maxArea(Node aNode) {
  if(aNode.rightChild==null) {
   return aNode.data.getArea();
  }
  else {
   return maxArea(aNode.rightChild);
  }
 }
 public void deleteAreas(double value) {
  while(maxArea(root)>= value) {
   deleteAreas(value,root);
  }
 }
 private Node deleteAreas(double value, Node aNode) {
  if(aNode == null) {
   return null;
  }
  if(aNode.data.getArea()>value) {
   return aNode.leftChild;
  }
  else {
   aNode.rightChild = deleteAreas(value,aNode.rightChild);
   return aNode;
  }
 }
 private Node findMinInTree(Node aNode) {
  if(aNode == null)
   return null;
  if(aNode.leftChild == null)//This node is the smallest value
   return aNode;
  else
   return findMinInTree(aNode.leftChild);
 }
 private Node deleteMinFromTree(Node aNode) {
  if(aNode == null)
   return null;
  if(aNode.leftChild == null)
   return aNode.rightChild;
  aNode.leftChild = deleteMinFromTree(aNode.leftChild);
  return aNode;
 }
}
