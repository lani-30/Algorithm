import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int i = sc.nextInt();
		
		m += i;
		
		if(m >= 60) {
			
			h += m / 60;
			if(h > 23) h = h-24;
			
			m %= 60;
			
		}
		
		System.out.println(h + " " + m);
		
	}

}
