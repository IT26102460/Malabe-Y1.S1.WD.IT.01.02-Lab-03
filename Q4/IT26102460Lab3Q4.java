import java.util.Scanner;
public class IT26102460Lab3Q4{
 public static void main(String[] args){
	int number, num1, num2, num3, num4, num5;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the 5-digit number: ");
	number=input.nextInt();
	
	num1= number/10000;
	number=number%10000;
	
	num2= number/1000;
	number=number%1000;
	
	num3= number/100;
	number=number%100;
	
	num4= number/10;
	number=number%10;
	
	num5=number;
	
	System.out.print(" ");
	System.out.print(num1 + " ");
	System.out.print(num2 + " ");
	System.out.print(num3 + " ");
	System.out.print(num4 + " ");
	System.out.print(num5);
	System.out.println(" ");
 }
}