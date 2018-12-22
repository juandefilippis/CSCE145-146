class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(double area, String shapeType, int side0, int side1, int radius) {
		root = insert(root, area, shapeType, side0, side1, radius);
	}

	private Node insert(Node node, double area, String shapeType, int side0, int side1, int radius) {
		if (node == null)
			node = new Node(area, shapeType, side0, side1, radius);
		else {
			if (area <= node.getArea())
				node.left = insert(node.left, area, shapeType, side0, side1, radius);
			else
				node.right = insert(node.right, area, shapeType, side0, side1, radius);
		}
		return node;
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(Node z) {
		if (z != null) {
			inorder(z.getLeft());
			System.out.print(z.getShapeType() + " ");
			if (z.getShapeType().equals("Rectangle") || z.getShapeType().equals("Right Triangle")) {
				System.out.print(" Side 1: " + (double) z.getSide1() + " Side 2: " + (double) z.getSide1() + " ");
			}
			if (z.getShapeType().equals("Circle")) {
				System.out.print(" Radius: " + (double) z.getRadius() + " ");
			}
			System.out.print("Area: " + z.getArea() + "\n");
			inorder(z.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node v) {
		if (v != null) {
			System.out.print(v.getShapeType() + " ");
			if (v.getShapeType().equals("Rectangle") || v.getShapeType().equals("Right Triangle")) {
				System.out.print(" Side 1: " + (double) v.getSide1() + " Side 2: " + (double) v.getSide2() + " ");
			}
			if (v.getShapeType().equals("Circle")) {
				System.out.print(" Radius: " + (double) v.getRadius() + " ");
			}
			System.out.print("Area: " + v.getArea() + "\n");
			preorder(v.getLeft());
			preorder(v.getRight());
		}
	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node q) {
		if (q != null) {
			postorder(q.getLeft());
			postorder(q.getRight());
			System.out.print(q.getShapeType() + " ");
			if (q.getShapeType().equals("Rectangle") || q.getShapeType().equals("Right Triangle")) {
				System.out.print(" Side 1: " + (double) q.getSide1() + " Side 2: " + (double) q.getSide2() + " ");
			}
			if (q.getShapeType().equals("Circle")) {
				System.out.print(" Radius: " + (double) q.getRadius() + " ");
			}
			System.out.print("Area: " + q.getArea() + "\n");
		}
	}
}