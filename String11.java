package WiproAssignment3;

import java.util.Scanner;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String a = scan.nextLine();
		int b = scan.nextInt();
		String c = a.substring(2, a.length());
		//for(int i=0;i<b;i++){
			System.out.println(c);
		//}
	}

}
