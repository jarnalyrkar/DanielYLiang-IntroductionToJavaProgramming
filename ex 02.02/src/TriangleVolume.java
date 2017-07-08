import java.util.Scanner;

public class TriangleVolume {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double heron = 0.433;
		
		System.out.print("Enter length of the sides and height of the triangle: ");
		double length = sc.nextDouble();
		sc.close();
		
		double area = (length*length)*heron;
		System.out.println("The area is " + area);
		
		double volume = area*length;
		System.out.println("The volume of the triangular prism is: " + volume);
	}

}
