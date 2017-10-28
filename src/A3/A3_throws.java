package A3;

import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class A3_throws {

	public static void main(String[] args) throws IOException{
		
		Scanner in =new Scanner(System.in);
		double number=in.nextDouble();

		
		try{
			try{
				
				if(number<0)
					throw new IOException();
				

			}
			finally{				//¹Ø±Õ×ÊÔ´
				in.close();
			}
			
			
		}
		catch(IOException e){
			throw e;
			
		}
		
	
		
		
	
			
		/*
		 * try{
		 * 
		 * 
		 * FILEIO
		 * 
		 * 
		 * }
		 * catch(IOException e){
		 * 
		 * throw e;
		 * 
		 * 
		 * }
		 * 
		 * 
		 */
		
		
	}
	
	
}

