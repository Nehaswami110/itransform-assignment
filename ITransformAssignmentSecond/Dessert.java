package ITransformAssignmentSecond;

import java.util.Scanner;

public class Dessert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Dessert Restra");
		
		System.out.println("Choose your role : owner/customer");
		String role = sc.next();
		
		if(role.equalsIgnoreCase("owner")) {
			System.out.println("Add desert items");
			
		}else if(role.equalsIgnoreCase("customer")) {
			System.out.println("Please order");
			Candy c = new Candy(10,1.0);
			Cookie coo = new Cookie(20,2.0);
			IceCream ice = new IceCream(50, 1.5);
			System.out.println("Cost of candy is : "+c.getCost());
			System.out.println("Cost of cookie is : "+coo.getCost());
			System.out.println("Cost of icecream is : "+ice.getCost());
			System.out.println("Total bill is : "+(c.getCost()+coo.getCost()+ice.getCost()));
		}else {
			System.out.println("Invalid User/hacker ditacted☠️");
		}
		sc.close();
	}

}