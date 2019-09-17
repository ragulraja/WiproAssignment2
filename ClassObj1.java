package WiproAssignment3;

import java.util.Scanner;

class ClassObj1 {
	 	Scanner scan = new Scanner(System.in);
	 void calculate(){
		 System.out.println("Enter width");
		double width = scan.nextInt();
		System.out.println("Enter height");
		double height  = scan.nextInt();
		System.out.println("Enter depth");
		double depth = scan.nextInt();
		System.out.println("The volume =  " +width * height * depth);
	 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassObj1 a = new ClassObj1();
		 a.calculate();
	}

}
