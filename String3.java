package WiproAssignment3;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		String b = a.substring(0, 2);
		System.out.println(b+b+b+b+b);
	}

}
