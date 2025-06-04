package demo;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {5,8,6,3,9,1};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to search:");
		int target=sc.nextInt();
		boolean found=false;
		for(int i=1;i<numbers.length;i++) { 
			if(numbers[i]==target) {
			System.out.println("Found"+" "+ target+" at index" +" "+  i);
			found=true;
			break;
		}
		}
		
		if(!found) {
			System.out.println("Number not found");
		}

	}

}
