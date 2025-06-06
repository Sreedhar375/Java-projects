package f;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,2,4,1,3};
		//Bubble sort logic
		for(int i=0;i<numbers.length -1;i++) {
			for(int j=0;j<numbers.length -1;j++) {
				if(numbers[j]>numbers[j+1]) {
					//swapping
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
					
				}
			}
		}
//print the sorted numbers
		System.out.println("Sorted List");
		for( int num:numbers) {
			System.out.println(num);
		}
		//to sort the array in the same line 
		System.out.println(Arrays.toString(numbers));
	}

}

