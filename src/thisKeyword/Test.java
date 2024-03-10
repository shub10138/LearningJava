package thisKeyword;

public class Test {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		p.Print();

		// Chaining of function calls
		p.PointSetX(30).PointSetY(40).Print();
		
		
	}

}
