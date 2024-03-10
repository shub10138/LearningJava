package thisKeyword;

public class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point PointSetX(int x) {
		this.x = x;
		return this;
	}

	Point PointSetY(int y) {
		this.y = y;
		return this;
	}

	Point() {
		// Line 7,8 and line 23 have same functionality
		this(10, 10);
	}

	void Print() {
		System.out.println("x = " + x + ", y = " + y);
	}

}
