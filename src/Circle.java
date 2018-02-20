import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius of circle: ");
		double radius = in.nextDouble();
		System.out.println("The area of the circle: " + (Math.PI * radius * radius));
		in.close();
	}

}
