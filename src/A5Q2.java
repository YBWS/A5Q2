import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A5Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput=new Scanner(System.in);
		
		double[] userNumber = new double[10];
		int count = 0;
		int userValue;
		
		System.out.println("Please enter ten integer number");
		
		for(int i = 0;i <userNumber.length ;i++){
			System.out.println("Please enter a integer number : ");
			userNumber[i] = userInput.nextDouble();
			
		}
		
		System.out.println("What value do you want to search for?");
		userValue = userInput.nextInt();
		
		for(int i = 0; i < userNumber.length; i++){ 
			 if(userNumber[i]==userValue){ 
				count++; 
			} 
		}

		System.out.println("This was found "+count+" times.");
		
		userInput.close();


		
	}

}
