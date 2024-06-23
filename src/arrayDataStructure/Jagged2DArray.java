package arrayDataStructure;

public class Jagged2DArray {

	public static void main(String[] args) {
		int m = 3;
		int arr[][] = new int[m][];
//		Jagged Array is a 2D array with different row sizes
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
