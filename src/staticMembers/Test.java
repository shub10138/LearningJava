package staticMembers;

public class Test {

	public static void main(String[] args) {
		Player p1 = new Player("Virat");
		Player p2 = new Player("Rohit");

		p1.printPlayerDetails();
		p2.printPlayerDetails();

		System.out.println(Player.getPlayerCount());
		System.out.println(p1.getPlayerCount());

	}

}
