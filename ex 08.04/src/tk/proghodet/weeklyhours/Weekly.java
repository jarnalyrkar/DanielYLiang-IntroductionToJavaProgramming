/* Assignment:
 * Store weekly hours for 8 employees in a two-dimensional array.
 * Each row lists 7 days of work hours.
 * The programme should also display total hours in decreasing order of total hours
 * with the employees number. (8.4, page 306)
 */
package tk.proghodet.weeklyhours;

import java.util.Arrays;

public class Weekly {
	public static void main(String[] args) {
		
		int[][] workTab = new int[][]  {{2,4,3,4,5,8,8}, //	linje 1
										{7,3,4,3,3,4,4}, // linje 2
										{3,3,4,3,3,2,2}, // linje 3
										{9,3,4,7,3,4,1}, // linje 4
										{3,5,4,3,6,3,8}, // linje 5
										{3,4,4,6,3,4,4}, // linje 6
										{3,7,4,8,3,8,4}, // linje 7
										{6,3,5,9,2,7,9}};// linje 8
		
		int[] lineArr = new int[7];
		int[] totArr = new int[8];
		
		int counter = 0;
		
		for (int i=0; i<totArr.length;i++) {
			counter = 0;
			
			for (int j=0; j<lineArr.length;j++) {
				lineArr[j] = workTab[i][j];
				counter += workTab[i][j];
				totArr[i] = counter;
			}
	}
		int count=0;
		int[] sisteTab;
		sisteTab = Arrays.copyOf(totArr, totArr.length);
		Arrays.sort(sisteTab);
			System.out.println(Arrays.toString(sisteTab));
		}
	
	// TODO: Missing sorting method for array, which includes employee number
	
}