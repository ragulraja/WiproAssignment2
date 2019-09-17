package WiproAssignment3;

import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String a = scan.nextLine();
		StringBuffer sb = new StringBuffer(a);
		for(int i=0;i<a.length();i++){
		if(a.charAt(i)=='*'){
			sb.deleteCharAt(i-1);
			sb.deleteCharAt(i);
			System.out.println(sb);
		}
		}
		
	

}
}