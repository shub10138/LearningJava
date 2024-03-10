package accessModifiersPackageOne;

public class PrivateClass2 {

	private String name;

	public void nameInput(String name) {
		char arr[] = name.toCharArray();
		if (Character.isUpperCase(arr[0])) {
			this.name = name;
			System.out.println("Your name is " + name);
		} else {
			System.out.println("Name should start with a capital letter");
		}
	}

}
