package exceptionHandling;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			String balance[] = new String[10];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to add in balance");
			balance[0] = sc.next();
			int amount = Integer.parseInt(balance[0]);
			updateBalance(amount);

		} catch (InvalidBalanceException ex) {
			System.out.println("Invalid Balance Exception detected");
			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			System.out.println("Number Format Exception detected");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index Out Of Bounds Exception detected");
		} catch (Exception ex) {
			System.out.println("Deteced a new type of exception");
		} finally {
			System.out.println("Moving on....");
		}

		System.out.println("Main executed successfully");
	}

	public static void updateBalance(int amount) throws InvalidBalanceException {
		if (amount < 0) {
			throw new InvalidBalanceException("Amount can't be less then zero");
		} else {
			System.out.println("Balance updated successfully");
		}
	}

}
