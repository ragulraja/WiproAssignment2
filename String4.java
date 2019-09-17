package WiproAssignment3;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		if(a.length() % 2 ==0){
			System.out.println(a.substring(0,a.length()/2));
		}
		else{
			System.out.println("Null");
		}
	}

}
