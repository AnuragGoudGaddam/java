package java_project1;

public class Sorting_prac {

	public static void main(String[] args) {
		int arr[] = { 101, 20, 110, 2, 3, 54 };

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
				}
			}
			
		}
		printTheStatement(arr);
	}
 
	public static void printTheStatement(int arr[]) {
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
		
	}
	
}
