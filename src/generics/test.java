package generics;

public class test {

	public static void main(String[] args) {
		pairs p = new pairs();
		p.x = 12;
		p.y = "Shubham";

		String str = (String) p.x;

	}

}
