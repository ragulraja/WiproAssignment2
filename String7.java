package WiproAssignment3;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		if(a.charAt(0)=='x' || a.lastIndexOf(a)=='x'){
			System.out.println(a.substring(1,a.length()-1));
		}
		else{
			System.out.println(a);
			
		}
			
		}
	}


