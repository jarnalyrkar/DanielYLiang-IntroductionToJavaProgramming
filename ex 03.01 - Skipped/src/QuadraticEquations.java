// b^2 - 4ac is called the discriminant of the quadratic equation.
// if positive: two real roots
// if zero: one real root
// if negative: no real roots

// Henger ikke med på matta her - får ikke riktig svar :S

public class QuadraticEquations {

	public static void main(String[] args) {
		double a, b, c;
		double discriminant = 1;
		
		
		//Input:
		System.out.println("Enter a, b and c: ");
		a = 1.0;
		b = 3;
		c = 1;
		
		//Calculation:
		double root1 = (-b + Math.sqrt((Math.pow(b, 2)) - (4*a)+(4*c) / (2*a)));
		double root2 = (-b - Math.sqrt((Math.pow(b, 2)) - (4*a)+(4*c) / (2*a)));
		
		//Output: 
		if (discriminant == 0) {
			System.out.println("The equation has one root: " + root1);
		} else if (discriminant > 0) {
			System.out.println("The equation has two roots: " + root1 + " and " + root2);
		} else {
			System.out.println("The equation has no real roots");
		}
			
		
	}

}
