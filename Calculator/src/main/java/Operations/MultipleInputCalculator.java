package Operations;
import java.util.List;

public class MultipleInputCalculator {

	
		
	//All the operations as per requirement
	//1. Addition
	public static double add(List<Double> numbers)
	{
		double sum=0;
		for (double num: numbers) {
			sum +=num;
			}
		return sum;
	}
	
	//2. Subtraction
		public static double sub(List<Double> numbers)
		{
			if(numbers.isEmpty()) 
				return 0;
			double result = numbers.get(0);
			
			for (int i=1; i<numbers.size(); i++) {
				result -=numbers.get(i);
				}
			return result;
		}
		
	//3. Multiplication
		public static double mul(List<Double> numbers)
		{
			if(numbers.isEmpty()) 
				return 0;
			double result = 1;
			for (double num: numbers) {
				result *=num;
				}
			return result;
		}
	
	//4. Division
		public static double divide(List<Double> numbers)
		{
			if(numbers.isEmpty()) 
				return 0;
			double result = numbers.get(0);
			for (int i=1; i<numbers.size(); i++) {
				if(numbers.get(i) == 0) {
					throw new ArithmeticException("Divide by 0 is not allowed.");
				}
				result /=numbers.get(i);
			}
			return result;
		}
	
	//5. Square root
		public static double sqRoot(double num) 
		{
			if(num<0) {
				System.out.println("Cannot calculate sq. root of negative number");
			}
			
			return Math.sqrt(num);
			
			
		}
		
	
}
