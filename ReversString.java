package New.folder;
import java.util.Arrays;
import java.util.Scanner;

public class ReversString {
    
    public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter array lenths:");
		
		int n = myObj.nextInt();
		int[] firstArray = new int[n];
		
		for (int i = 0; i < n; i++) 
		    { 
		
		     firstArray[i] = myObj.nextInt();
		    }

		int[] lastArray = new int[firstArray.length];
		int lastArraylength = 0;
		for (int j = firstArray.length - 1; j >= 0; j--) 
		{
		  lastArray[lastArraylength] = firstArray[j];
		  lastArraylength++;
		}
		System.out.println(Arrays.toString(lastArray));
	}

    
}
