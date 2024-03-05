import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		String b=sc.next();
		
		System.out.println(Character.getNumericValue(b.charAt(2)) * a);
		System.out.println(Character.getNumericValue(b.charAt(1)) * a);
		System.out.println(Character.getNumericValue(b.charAt(0)) * a);
		System.out.println(Integer.valueOf(b) * a);

	}

}
