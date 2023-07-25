package ITransformAssignmentFirst;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eng=45,math=65,hindi=70;
		if (math > 60 && eng > 60 && hindi > 60) {
			System.out.println("Pass");
		} else if (math > 60 && hindi > 60 && eng <=60) {
			System.out.println("Promoted");

		} else if (math > 60 && eng > 60 && hindi <=60) {
			System.out.println("Promoted");

		} else if (eng > 60 && hindi > 60 && math <=60) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("failed");
		}

	}

}
