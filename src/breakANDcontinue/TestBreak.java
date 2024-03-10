package breakANDcontinue;

public class TestBreak {

	public static void main(String[] args) {

		int i;
		for (i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 1)
					break;
				System.out.println(j);
			}
		}
		System.out.println(i);
	}

}
