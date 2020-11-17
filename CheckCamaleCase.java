package New.folder;

import java.util.Scanner;
public class CheckCamaleCase {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter String a cammel case:");
        String s =scanner.nextLine();
        int counter =1;
        for(int i =0;i<=s.length()-1;i++){
            
         char c=s.charAt(i);
         if(c>='A' && c<='Z'){
           counter ++;
            }
        }
        System.out.println(counter);
    }
    
}
