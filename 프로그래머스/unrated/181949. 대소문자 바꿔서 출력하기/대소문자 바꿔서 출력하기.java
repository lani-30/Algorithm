import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String b = "";
        
        for(int i=0; i<a.length(); i++){
            char temp = a.charAt(i);
                        
            if(temp < 97){
                b+=a.valueOf(temp).toLowerCase();
            } else{
                b+=a.valueOf(temp).toUpperCase();            
            }
        }
        
        System.out.println(b);
        
    }
}