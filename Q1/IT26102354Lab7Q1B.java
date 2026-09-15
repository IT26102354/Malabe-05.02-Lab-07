import java.util.Scanner;
public class IT26102354Lab7Q1B{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int mark1,mark2,mark3,mark4;
	double average;
	
	for ( int student = 1; student <= 3; student++){
		System.out.println("Student" + student);
		System.out.print("Enter marks :");
		
		mark1 = input.nextInt();
		
		
		if (mark1 > 100 || mark1 < 0 ){
			System.out.println("Error : marks should not be greater than 100 or less than 0 ");
			System.out.println("Terminating the program");
			break;
		}
		
		mark2 = input.nextInt();
		
		
		if (mark2 > 100 || mark2 < 0 ){
			System.out.println("Error : marks should not be greater than 100 or less than 0 ");
			System.out.println("Terminating the program");
			break;
		}
		mark3 = input.nextInt();
		
		
		if (mark3 > 100 || mark3 < 0 ){
			System.out.println("Error : marks should not be greater than 100 or less than 0 ");
			System.out.println("Terminating the program");
			break;
		}
		mark4 = input.nextInt();
		
		
		if (mark4 > 100 || mark4 < 0 ){
			System.out.println("Error : marks should not be greater than 100 or less than 0 ");
			System.out.println("Terminating the program");
			break;
			}
		average = (mark1 + mark2 + mark3 + mark4 )/4.0;
					
					System.out.println("Average is :" + average);
					
					if(average >= 75){
						System.out.println("Overall Grade is : Distinction");
					}
					 
					else if (average >= 50){
						System.out.println("Overall Grade is : Credit");
					}
					
					else{
						System.out.println("Overall Grade is : Fail");
					}
	}
	}
}