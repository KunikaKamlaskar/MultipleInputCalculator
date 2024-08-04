package Operations;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MainOperationsCalculator {

	public static void main(String[] args) {
		//main method for calculator app
		
		MultipleInputCalculator m1= new MultipleInputCalculator();
		
		
		Scanner sc= new Scanner(System.in);
		boolean continueCalculating = true;
				
		while (continueCalculating) {
			System.out.println("This is Multi Input Calculator \n Please Select Operations as per you requirements \n 1)Addition \n 2)Substraction \n 3)Multiplication \n 4)Division \n 5)Square root \n 6)Exit");
			
			int userChoice = sc.nextInt();
			
			if (userChoice == 6) {
				continueCalculating = false;
				System.out.println("Exiting Calculator. \n Goodbye!!!");
				continue;
			}
			
			List<Double> numbers= new ArrayList<Double>();
			double result=0;
			
			if (userChoice == 5) {
				System.out.println("Enter single number");
				sc.nextLine();
				double number;
						
			try{
				number= Double.parseDouble(sc.nextLine());
				}
			catch(NumberFormatException e){
				System.out.println("Envalid number format. Please enter valid number format");
				continue;
			}
			
			try {
			result =m1.sqRoot(number);
			System.out.println("Result:  "+ result);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			continue;
		}
			
			System.out.println("Enter numbers separated by space as this is Multi Input Calculator(When done please click on enter)");
			sc.nextLine();
			String inputline = sc.nextLine();
			String[] list= inputline.split("\\s+");
			//perfect till now
			
			try {
				switch(userChoice) {
				case 1 : 
					result= m1.add(numbers);	
					break;
				
				case 2 :
					result= m1.sub(numbers);
					break;
					
				case 3 :
					result= m1.mul(numbers);
					break;
				
				case 4 :
					result= m1.divide(numbers);
					break;
									
				default:
					System.out.println("Entered wrong choice.");
					continue;
				}
				System.out.println("Result:  "+ result);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
						
		}
		sc.close();

	}

}
