package ITransformAssignmentSecond;

abstract class Shape {

	public abstract void draw(int n);

}

class Line extends Shape {

	@Override
	public void draw(int n) {

		for (int i = 0; i < n; i++)
			System.out.print("-");

	}

}

class Rectangle extends Shape {

	@Override
	public void draw(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n+5; j++) {

				if (i == 0 || i == n - 1 || j == 0 || j == n +4 )
					System.out.print("*");
				else
					System.out.print(" ");

			}

		}
	}

}

class cube extends Shape {

	@Override
	public void draw(int n) {
		// TODO Auto-generated method stub

	}

}

public class Drawshape {

	public static void main(String[] args) {
		
		Line l = new Line();
		
		l.draw(5);

		Rectangle rec = new Rectangle();

		rec.draw(5);

	}

}
