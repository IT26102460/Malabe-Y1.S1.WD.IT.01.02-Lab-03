import java.util.Scanner;
public class IT26102460Lab3Q2{
 public static void main(String[] args){
	double Monthly_Salary, OT_Hours, OT_Amount, OT_Hourly_Rate, Total_Salary;
	
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter your monthly Salary: ");
	Monthly_Salary = input.nextDouble();
	
	System.out.print("Enter the number of OT hours: ");
	OT_Hours = input.nextDouble();
	
	System.out.print("Enter the OT hourly rate: ");
	OT_Hourly_Rate = input.nextDouble();

	
	OT_Amount = OT_Hours * OT_Hourly_Rate;
	Total_Salary = Monthly_Salary + OT_Amount;
	
	System.out.println(" ");
	System.out.print("The total Salary with OT is: " + Total_Salary);

	
 }
}