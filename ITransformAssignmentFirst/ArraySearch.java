package ITransformAssignmentFirst;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] array = new int[] {5,1,2,14,5,66,98,66,5,445,77,19,16,88,10};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number to search :");
		int a = sc.nextInt();
		
		for(int i =0;i<15;i++) {
			if(array[i] == a) {
				System.out.println("Number found");
				System.exit(0);
			}
		}
		System.out.println("No such number exists ");
		sc.close();
	}
}


