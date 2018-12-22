class Node {
	Node left, right;
	int side0, side1, radius;
	String shapeType;
	double area;

	public Node() {
		left = null;
		right = null;
		shapeType = "";
		area = 0;
		side0 = side1 = radius = 0;
	}

	public Node(double a, String string, int side0, int side1, int radius) {
		left = null;
		right = null;
		area = a;
		shapeType = string;
		side0 = side0;
		side1 = side1;
		radius = radius;
	}

	public void setLeft(Node x) {
		left = x;
	}

	public void setRight(Node y) {
		right = y;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setData(double a) {
		area = a;
	}

	public double getArea() {
		return area;
	}

	public String getShapeType() {
		return shapeType;
	}

	public int getSide1() {
		return side0;
	}

	public int getSide2() {
		return side1;
	}

	public int getRadius() {
		return radius;
	}
}