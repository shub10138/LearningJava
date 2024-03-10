package finalKeyword;

//final public class Base {
//can't extend Base class because it is a Final class, No Inheritance

public class Base {

	// Class or Static Final variable
	static final int MAX = 500;
	// static{MAX=100;}

	// Instance final variable
	final int x = 99;
	// or, {x=100;} by instance block
	// or, Base(){x=100;} by constructor

	// No over Riding of a final method
	final void fun() {
		System.out.println();
	}

}
