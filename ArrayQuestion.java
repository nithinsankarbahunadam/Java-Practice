import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		
		Scanner bin = new Scanner(System.in);
		
		
		int arrayLength = bin.nextInt();
		
		int findValue = bin.nextInt();
		
		
		int[] givenArray = new int[arrayLength];
		
		
		for(int i=0; i<arrayLength; i++){
		    
		    givenArray[i] = bin.nextInt();
		    
		}
		
		String foundValue = "NO";
		
		for(int i=0; i<arrayLength; i++){
		    
		    if(givenArray[i] == findValue){
		        
		        foundValue = "YES";
		        
		    }
		    
		}
		
		System.out.println(foundValue);
		
		
		
		
		

	}
}
