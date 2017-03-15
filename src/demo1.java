import java.util.Scanner;

public class demo1 extends Thread {
	int a,b,c;
	//override run method
	public void run(){
		System.out.println(" " );
		System.out.println(" Substraction ");
		System.out.println("Enter the value of a and b is ");
	//performimg subtraction		
		Scanner obj = new Scanner(System.in);
		//user input		
			a = obj.nextInt();
			b = obj.nextInt();
			
			c = a - b;
			
			System.out.println("substraction is " +c);
			System.out.println("Now enter for addition ");
	}

}
