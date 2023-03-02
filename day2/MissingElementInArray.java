package week1.day2;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1, 2,3,}; 
		int missingElement = findMissingElement(arr); 
		System.out.println("The missing element is " + missingElement);
	}

	public static int findMissingElement(int[] arr) {
		int n = arr.length + 1; 
		int sum = n * (n + 1) / 2;      
		int actualSum = 0; 
		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		int missingElement = sum - actualSum; 
		return missingElement;
	}

}