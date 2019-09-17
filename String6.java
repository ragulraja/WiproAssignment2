package WiproAssignment3;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		System.out.println("Enter another String");
		String b= scan.nextLine();
		if(a.length()<=5){
			System.out.println(a+b+a);
		}
		else if(a.length()>=4){
			System.out.println(b+a+b);
			
		}
	}

}
