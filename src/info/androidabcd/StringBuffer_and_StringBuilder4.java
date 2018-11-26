//Java program to demonstrate conversion from 
//From StringBuffer to StringBuilder or vice-versa 

package info.androidabcd;

public class StringBuffer_and_StringBuilder4 
{ 
	public static void main(String[] args) 
	{ 
		StringBuffer sbr = new StringBuffer("Geeks"); 
		
		// conversion from StringBuffer object to StringBuilder 
		String str = sbr.toString(); 
		StringBuilder sbl = new StringBuilder(str); 
		
		System.out.println(sbl); 
		
	} 
} 
