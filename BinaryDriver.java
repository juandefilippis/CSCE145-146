import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryDriver {
	public static void main(String[] args) {
		File file = new File("Binary Shapes.txt");
		Scanner sc = null;
		String shapeType;
		int side0, side1, radius;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		BinarySearchTree binary = new BinarySearchTree();
		System.out.println("Reading from file");
		while (sc.hasNext()) {
			shapeType = sc.next();
			if (shapeType.equals("Rectangle")) {
				side0 = sc.nextInt();
				side1 = sc.nextInt();
				System.out.println("Rectangle " + side0 + " " + side1);
				binary.insert(side0 * side1, "Rectangle", side0, side1, 0);
			}
			if (shapeType.equals("Right")) {
				sc.next();
				side0 = sc.nextInt();
				side1 = sc.nextInt();
				System.out.println("Right Triangle " + side0 + " " + side1);
				binary.insert(0.5 * side0 * side1, "Right Triangle", side0, side1, 0);
			}
			if (shapeType.equals("Circle")) {
				radius = sc.nextInt();
				System.out.println("Circle " + radius);
				binary.insert(3.1412 * radius * radius, "Circle", 0, 0, radius);
			}
		}

		System.out.println("");
		System.out.println("Printing Post order : ");
		binary.postorder();
		
		System.out.println("");
		System.out.println("Printing Pre order : ");
		binary.preorder();
		
		System.out.println("");
		System.out.println("Printing In order : ");
		binary.inorder();
	}
}