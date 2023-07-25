package ITransformAssignmentFirst;

import java.util.Scanner;

public class TaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value ");
		double num=sc.nextDouble();
		if(0<=num && num<=180000) {
			System.out.println("nil");
		}
		else if(num<=181001 && num<=300000) {
			System.out.println(num/10);
		}
		else if(num <=300001 && num<=500000) {
			System.out.println(num/5);
			
		}
		else if(num<=500001 && num<=1000000) {
			System.out.println(num*3/10);
		}
		else {
			System.out.println("out of range");
		}

	}

}
