package switchStatement;

import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {

		int x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you move from L, R, U, D");
		char move = sc.next().charAt(0);

		switch (move) {
		case 'L':
			x--;
			break;
		case 'R':
			x++;
			break;
		case 'U':
			y++;
			break;
		case 'D':
			y--;
			break;
		default:
			System.out.println("Wrong move");
		}

		System.out.println("x = " + x + " ,y = " + y);
	}

}
