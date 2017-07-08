import java.util.Scanner;

public class GeoDistance {
	public static void main(String[] args) {

		double x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		
		//Inndata
		System.out.println("Enter x1 and y1: ");
		x1 = 1.5;//sc.nextDouble();
		x2 = 4;//sc.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		y1 = -3.4;//sc.nextDouble();
		y2 = 5;//sc.nextDouble();
		
		sc.close();
		
		//Beregning
		System.out.println(Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5));
	}
}