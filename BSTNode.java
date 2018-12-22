/*
* Written by Juan De Filippis
*/
 
 class BSTNode
 {
     BSTNode left, right;
     int data;

 //Constructor 
 public BSTNode()
 {
   left = null;
    right = null;
    data = 0;
 }

 public BSTNode(int n)
 {
   left = null;
   right = null;
   data = n;
 }

// Function that sets the left node 
  public void setLeft(BSTNode n)
  {
      left = n;
  }

// Function that sets the right node
  public void setRight(BSTNode n)
  {
      right = n;
  }

// Function to get left node 
  public BSTNode getLeft()
 {
      return left;
 }

// Function to get right node 
  public BSTNode getRight()
 {
      return right;
  }

// Function to set data to node 
  public void setData(int d)
   {
        data = d;
   }

//Function to get data from node 
   public int getData()
   {
       return data;
   }   
}

  class IntBST {

    private BSTNode root;

    public IntBST()
   { 
       root = null;
    }

//check if tree is empty 
public boolean isEmpty()
 {
    return root == null;
 }

//to insert data 
public void insert(int data)
 {
     root = insert(root, data);
 }

//to insert data recursively  
 private BSTNode insert(BSTNode node, int data)
 {
       if (node == null)
         node = new BSTNode(data);
        else
        {
          if (data <= node.getData())
          node.left = insert(node.left, data);
          else
           node.right = insert(node.right, data);
        }
          return node;
}

//to delete data 
   public void delete(int k)
 {
     if (isEmpty())
       System.out.println("Tree Empty");
       else if (search(k) == false)
        System.out.println("Sorry "+ k +" is not present"); 
          else
          {
             root = delete(root, k);
               System.out.println(k+ " deleted from the tree");
          }
    }
         private BSTNode delete(BSTNode root, int k)
{
    BSTNode p, p2, n;
    if (root.getData() == k)
 {
      BSTNode lt, rt;
      lt = root.getLeft();
      rt = root.getRight();
      if (lt == null && rt == null) 
         return null;
         else if (lt == null)
        {
                p = rt;
                return p;
       }
        else if (rt == null)
        {
            p = lt;
            return p;
      }
       else
      {
         p2 = rt;
         p = rt;
 while (p.getLeft() != null)
        p = p.getLeft();
        p.setLeft(lt);
        return p2;
   }
}
     if (k < root.getData())
     {
       n = delete(root.getLeft(), k);
       root.setLeft(n);
   }
     else
{
      n = delete(root.getRight(), k);
      root.setRight(n);   
}
return root;
}

private int k;


int getDepth( int data)
{
return depth(root, data, 0);
}

private int depth(BSTNode node, int data, int level)
{
if (node == null)
return 0;

if (node.data == data)
return level;

int downlevel = depth(node.left, data, level + 1);
if (downlevel != 0)
return downlevel;

downlevel = depth(node.right, data, level + 1);
return downlevel;
}


public boolean search(int val)
{
return search(root, val);
}

private boolean search(BSTNode r, int val)
{
boolean found = false;
while ((r != null) && !found)
 {
   int rval = r.getData();
     if (val < rval)
     r = r.getLeft();
    else if (val > rval)
       r = r.getRight();
else
 {
   found = true;
    break;
  }
    found = search(r, val);
    }
     return found;
 }
  

public void preorder()
   {
    preorder(root);
}

private void preorder(BSTNode r)
  {
        if (r != null)
     {
       System.out.println(r.getData() +" ");
        preorder(r.getLeft());   
        preorder(r.getRight());
  }
 }
}

