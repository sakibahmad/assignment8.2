/*
 * program for timer via sleep method
 */
import java.util.Scanner;
		//define class extend with class Thread
public class Demothread extends Thread {
		//override run method of thread class
	public void run() {
		// try for intrupt handling
		try {
		//process for one time
		

				System.out.println("Addition");
		// define variable		
				int a, b, c;
				System.out.println("enter the value of a and b for addition");
				System.out.println(" ");
				System.out.println("time out for addition ");
				sleep(4500);
				
				Scanner obj = new Scanner(System.in);
		//user input		
				a = obj.nextInt();
				b = obj.nextInt();
				
				
		//method to get the name for the current thread	
				System.out.println("current thread is " );
				System.out.println(Thread.currentThread().getName());
		//method to sleep the thread		
				
				c = a + b;
				System.out.println("Addition of a and b is " +c);
		//performimg subtraction		
			
		
		//catch for intrupt	

		} catch (Exception ex) {

		}
	}
		//main method
	public static void main(String[] a) {
		Demothread obj = new Demothread();
		obj.setName("TIMER processing... ");
		Thread t1=new Thread(obj);
		t1.start();
		demo1 obj1= new demo1();
		Thread t2=new Thread(obj1);
		
		t2.start();

	}
}
