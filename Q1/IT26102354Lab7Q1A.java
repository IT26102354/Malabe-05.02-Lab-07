import java.util.Scanner;
public class IT26102354Lab7Q1A{
	
	public static void main(String[] args){
	
	//create a scanner object to read input
	Scanner input = new Scanner(System.in);
	
	int mark1,mark2,mark3,mark4;
	double average;
	
	System.out.println("Enter marks for four subjects : ");
	
	
	System.out.println("Enter subjects mark 1 : ");
	mark1 = input.nextInt();
	
	if (mark1 > 100 || mark1 < 0 ){
		System.out.println("Error : marks should not be greater than 100 or less than 0");
		System.out.println("Terminating the program");
	}
	else {
	System.out.println("Enter subjects mark 2 : ");
	mark2 = input.nextInt();
	
		if (mark2 > 100 || mark1 < 0 ){
			System.out.println("Error : marks should not be greater than 100 or less than 0 ");
			System.out.println("Terminating the program");
		}
		else{
			System.out.println("Enter subjects mark 3 : ");
			mark3 = input.nextInt();
			
			if (mark3 > 100 || mark1 < 0 ){
				System.out.println("Error : marks should not be greater than 100 or less than 0");
				System.out.println("Terminating the program");
			}
			else{
				System.out.println("Enter subjects mark 4 : ");
				mark4 = input.nextInt();
				
				if (mark4 > 100 || mark1 < 0 ){
					System.out.println("Error : marks should not be greater than 100 or less than 0");
					System.out.println("Terminating the program");
				}
				else {
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
	
	}
	}
}