import java.util.Scanner;
public class IT26102460Lab3Q1B{
 public static void main(String[] args){
	//Initialize Variables 
	double Price_of_1kg, Number_of_kgs, Total_Price, Discounted_Price, Total_After_Discount; 
	 
	//Scanner object created
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice: ");
	Price_of_1kg=input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want: ");
	Number_of_kgs=input.nextDouble();
	
	//Calculation of total price
	Total_Price=Price_of_1kg * Number_of_kgs;
	
	//Discount Price
	
	Discounted_Price=Total_Price * 0.10;
	
	Total_After_Discount=Total_Price-Discounted_Price;
	
	System.out.println("Total Price: " + Total_After_Discount); 
 }
}