import java.util.Scanner;
public class IT26102460Lab3Q1A{
 public static void main(String[] args){
	//Initialize Variables 
	double Price_of_1kg, Number_of_kgs, Total_Price; 
	 
	//Scanner object created
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice: ");
	Price_of_1kg=input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want: ");
	Number_of_kgs=input.nextDouble();
	
	//Calculation of total price
	Total_Price=Price_of_1kg * Number_of_kgs;
	
	System.out.println("Total Price: " + Total_Price);
 }
}