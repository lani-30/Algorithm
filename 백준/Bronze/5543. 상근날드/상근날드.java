

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int hamburger = 2000;
		
		for(int i=0; i<3; i++) {
			int price = Integer.parseInt(br.readLine());
			if(hamburger >= price) {
				hamburger = price;
			}
		}
		
		int coke = Integer.parseInt(br.readLine());
		int sida = Integer.parseInt(br.readLine());
		
		int drink = Math.min(coke, sida);
		
		bw.write(hamburger + drink - 50 +"");
		
		bw.flush();
		br.close();
		bw.close();
	}
}




