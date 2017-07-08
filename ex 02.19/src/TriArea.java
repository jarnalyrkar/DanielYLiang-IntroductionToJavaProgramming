import java.util.Scanner;

// Finner arealet av en trekant
public class TriArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three points for a triangle (x and y): ");
		double x1, x2, x3, y1, y2, y3;
		
		//Input: 
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		sc.close();
		
		//Eksempeldata:
		//x1 = 1.5; y1 = -3.4; x2 = 4.6; y2 = 5; x3 = 9.5; y3 = -3.4;
		
		//Calculation:
		double side1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		double side2 = Math.sqrt((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2)));
		double side3 = Math.sqrt((Math.pow((x1 - x3), 2)) + (Math.pow((y1 - y3), 2)));
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt((s)*(s-side1)*(s-side2)*(s-side3));
		
		//Output: 
		System.out.println(side1);
		System.out.println(side2);
		System.out.println(side3);
		System.out.println(s);
		System.out.println("The area of the triangle is " + area);
	}
}
