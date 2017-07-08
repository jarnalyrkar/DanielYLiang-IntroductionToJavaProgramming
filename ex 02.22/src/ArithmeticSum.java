import java.util.Scanner;

public class ArithmeticSum {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter speed and acceleration: ");
			
			//Input:
			double firstNum = sc.nextDouble();
			double difference = sc.nextDouble();
			int nth = 46;
			sc.close();
			
			//Eksempeldata: 
			//firstNum = 60;
			//difference = 3.5;
			
			//Loop variables: 
			double count = 1.0;
			double number = 0.0;
			double sum = 0.0;
			
			while(count<nth){
				number = firstNum+(count-1)*difference;
				count++;
				sum += number;
			}
			
			//Output: 
			System.out.println(sum);
		}

	}



	