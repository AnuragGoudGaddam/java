package java_project1;

public class Selection_array {

	public static void main(String[] args) {
       
		int arr[] = {11,7,8,3,1,2,4};
		
		for(int i=0;i<arr.length-1;i++) {
			 int smalest =i;
			for (int j =i+1; j < arr.length; j++) {
				if (arr[smalest] > arr[j] ) {
					smalest=j;
				}
			}
			int temp= arr[smalest];
			arr[smalest]= arr[i];
			arr[i] = temp ;
			
		}
		printArray(arr);
		
		
		}
	public static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
	}




