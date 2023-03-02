package week1.day2;

public class Smallestnumber{

	public static void main(String[] args) {
		int[] value= {23,45,67,32,89,22};		
		for (int i = 0; i < value.length; i++) {
			for (int j = i+1; j < value.length ; j++) {
				int temp = 0;
				if(value[j]<value[i]) {
					temp = value[i];
					value[i] = value[j];
					value[j] = temp ;

				}

			
			}
	
			System.out.println(value[i]);
		
			}
		System.out.println("second smallest number :"+value [1]);
		
		}
	}

