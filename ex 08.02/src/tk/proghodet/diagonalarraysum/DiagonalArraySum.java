package tk.proghodet.diagonalarraysum;

import java.util.Scanner;

public class DiagonalArraySum {
		public final static int ROWS = 4;
		public final static int COLUMNS = 4;
		public Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			double[][] array = new double[ROWS][COLUMNS];
			
			
			array[0][0] = 5;	array[1][0] = 2;	array[2][0] = 3;	array[3][0] = 4;	
			array[0][1] = 1;	array[1][1] = 5;	array[2][1] = 3;	array[3][1] = 4;
			array[0][2] = 1;	array[1][2] = 2;	array[2][2] = 5;	array[3][2] = 4;
			array[0][3] = 1;	array[1][3] = 2;	array[2][3] = 3;	array[3][3] = 5;
			
			System.out.println(sumMajorDiagonal(array));
		}

		public static double sumMajorDiagonal(double[][] m) {
			double sum = 0.0;
			
			for (int i = 0; i<COLUMNS; i++) {
				for (int j = 0; j<ROWS; j++) {
					sum += m[i][j];
					i++;
				}
			}
				return sum;
		}
		
	}
