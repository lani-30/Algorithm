import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tp = sc.nextInt();
		int j = sc.nextInt();
		
		for(int i=j; i>=1; i--) {
			int s = sc.nextInt();
			int p = sc.nextInt();
			
			tp -= (s*p);
		}
		
		if(tp==0) System.out.println("Yes");
		else System.out.println("No");
	}

}