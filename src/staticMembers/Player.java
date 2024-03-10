package staticMembers;

public class Player {
	String name;
	int id;
	private static int playerCount;

	Player(String name) {
		this.name = name;
		id = ++playerCount;
	}

	void printPlayerDetails() {
		System.out.println(id + " : " + name);
	}

	static int getPlayerCount() {
		return playerCount;
	}
}
