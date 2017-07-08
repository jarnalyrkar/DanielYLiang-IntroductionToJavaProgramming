
public class Table {
	
	public static void main(String[] args) {
		//Header
		System.out.println("\t     a\t\t     b\t  \t    Middle Point");
		//1st. line
		double a = 0, b = 0, c = 2, d = 1;
		System.out.println("\t("+a+", "+b+")\t("+c+", "+d+")\t    ("+ (a+c)/2 + ", " + (b+d)/2+")");
		//2nd. line
		a = 1; b = 4; c = 4; d = 2;
		System.out.println("\t("+a+", "+b+")\t("+c+", "+d+")\t    ("+ (a+c)/2 + ", " + (b+d)/2+")");
		//3rd. line
		a = 2; b = 7; c = 6; d = 3;
		System.out.println("\t("+a+", "+b+")\t("+c+", "+d+")\t    ("+ (a+c)/2 + ", " + (b+d)/2+")");
		//4th. line
		a = 3; b = 9; c = 10; d = 5;
		System.out.println("\t("+a+", "+b+")\t("+c+", "+d+")\t    ("+ (a+c)/2 + ", " + (b+d)/2+")");
		//5th. line
		a = 4; b = 11; c = 12; d = 7;
		System.out.println("\t("+a+", "+b+")\t("+c+", "+d+")\t    ("+ (a+c)/2 + ", " + (b+d)/2+")");
	}
}
