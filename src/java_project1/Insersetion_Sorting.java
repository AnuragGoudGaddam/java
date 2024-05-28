
package java_project1;

public class Insersetion_Sorting {

	public static void main(String[] args) {
		int arr[] = { 10, 33, 27, 40, 12, 4, 2, 1 };

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;

		}
		printArray(arr);
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
