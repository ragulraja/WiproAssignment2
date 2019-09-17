package WiproAssignment3;

import java.util.Scanner;

class Patient{
		Scanner scan = new Scanner(System.in);
		void insert(){
			System.out.println("Enter Patient Name");
			String name = scan.nextLine();
			System.out.println("Enter Weight");
			double weight = scan.nextDouble();
			System.out.println(("Enter height"));
			double height = scan.nextDouble();
		
			System.out.println("The BMI is =  " + ( weight / ( height * height  ) ) * 703);
		}
	}
public class ClassObj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient a = new Patient();
		a.insert();
	}

}
