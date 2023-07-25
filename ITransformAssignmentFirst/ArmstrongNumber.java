package ITransformAssignmentFirst;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=150,originalnumber,rem,res=0;
		originalnumber=num;
		while(originalnumber!=0) {
			rem=originalnumber%10;
			res+=Math.pow(rem, 3);
			originalnumber/=10;
			
		}
		if(res==num) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}

	}

}
