package WiproAssignment3;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine();
		String temp = s;
		StringBuffer sb  = new StringBuffer(s);
		StringBuffer str = sb.reverse();
		System.out.println(str);
		String s1 = str.toString();
		if(temp.equals(s1)){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not Pallindrome");
		}
	}

}
