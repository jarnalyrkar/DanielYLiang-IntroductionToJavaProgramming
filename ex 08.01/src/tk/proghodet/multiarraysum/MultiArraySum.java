package tk.proghodet.multiarraysum;

import java.util.Scanner;

public class MultiArraySum {
	public final static int ROWS = 3;
	public final static int COLUMNS = 4;
	public Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double[][] array = new double[ROWS][COLUMNS];
		
		
		array[0][0] = 1;	array[1][0] = 2;
		array[0][1] = 1;	array[1][1] = 2;
		array[0][2] = 1;	array[1][2] = 2;
		array[0][3] = 1;	array[1][3] = 2;
		
		System.out.println(sumColumn(array, 0));
		System.out.println(sumColumn(array, 1));
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0.0;
		
		for (int i = 0; i<COLUMNS; i++) {
				sum += m[columnIndex][i];
		}
			return sum;
	}
	
}
