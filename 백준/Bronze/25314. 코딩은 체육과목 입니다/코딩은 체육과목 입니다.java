import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = "";
		
		for(int i=(n/4); i>0; i--) {
			s += "long ";
		}
		s += "int";
		System.out.println(s);
		
	}

}