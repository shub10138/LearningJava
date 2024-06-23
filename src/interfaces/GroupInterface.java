package interfaces;

public interface GroupInterface extends Interface1, Interface2 {
	// constant declaration i.e. public, static and final fields
	double E = 2.718282;

	// method signatures, public and abstract
	void doSomething(int i, double x);

	int doSomethingElse(String s);
}
