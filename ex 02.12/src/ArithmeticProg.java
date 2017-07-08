// Jeg får et annet svar enn i boka - jeg får 214, i boka står det 514.286..
import java.util.Scanner;

public class ArithmeticProg {

	public static void main(String[] args) {
		final int NTH = 46;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double firstNum = 60; //sc.nextDouble();
		double difference = 3.5; //sc.nextDouble();
		sc.close();
		
		double count = 1.0;
		double number = 0.0;
		
		while(count<NTH){
			number = firstNum+(count-1)*difference;
			count++;
			System.out.println(number);
		}
	
	}

}
