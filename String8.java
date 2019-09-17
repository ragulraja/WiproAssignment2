package WiproAssignment3;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int c = scan.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=c -1;i++)
			sb.append(a).append(b);
			sb.append(a);
			
			System.out.println(sb);
		
		
		
	}

}
