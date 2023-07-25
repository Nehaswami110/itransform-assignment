package ITransformAssignmentFirst;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=0;i<3;i++) {
			System.out.println("Enter username :");
			String user = sc.next();
			System.out.println("Password :");
			String pass =sc.next();
			
			if(user.equals(user) && pass.equals(pass)) {
				System.out.println("Welcome "+user);
				break;
			}
			count++;
		}
		if(count>=3) {
			System.out.println("Contact Admin");
		}
		
		
		
		
		sc.close();
		


	}

}
