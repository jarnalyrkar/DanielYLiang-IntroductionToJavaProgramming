
public class BMI {

	public static void main(String[] args) {

		double pWeight = 95.5;
		double iHeight = 50;
		
		// Omregning
		double weight = pWeight*0.45359237;
		double height = iHeight*0.0254;
		
		//Dele vekt på kvadratroten av høyden
		
		double bmi = (weight / (Math.pow(height, 2)));
		
		System.out.println(bmi);

	}

}
