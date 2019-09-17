package WiproAssignment3;

import java.util.Scanner;

class Calculator{
		Scanner scan = new Scanner(System.in);
		void powerInt(){
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println("The Power is " +Math.pow(num1, num2));
		}
		void powerdouble(){
			double num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println("The Power is " +Math.pow(num1, num2));
		}
	}
public class ClassObj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Calculator();
		a.powerInt();
		a.powerdouble();
	}

}
