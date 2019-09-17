package WiproAssignment3;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String str1 = scan.nextLine().toLowerCase();
		System.out.println("Enter another String");
		String str2 = scan.nextLine().toLowerCase();
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2.substring(1, str2.length()));
		System.out.println(sb);		
		
	}

}
