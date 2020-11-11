
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


	
	
	
	public class Main {
		static class FastReader 
	    { 
	   BufferedReader br; 
	   StringTokenizer st; 
	  
	
	   public FastReader() 
	   { 
	       br = new BufferedReader(new
	                InputStreamReader(System.in)); 
	   } 
	
	   String next() 
	   { 
	       while (st == null || !st.hasMoreTokens()) 
	       { 
	           try
	           { 
	               st = new StringTokenizer(br.readLine()); 
	           } 
	           catch (IOException  e) 
	           { 
	               e.printStackTrace(); 
	           } 
	       } 
	       return st.nextToken();
	       
	   } 
	
	   int nextInt() 
	   { 
	       return Integer.parseInt(next()); 
	   } 
	
	   long nextLong() 
	   { 
	       return Long.parseLong(next()); 
	   } 
	
	   double nextDouble() 
	   { 
	       return Double.parseDouble(next()); 
	   } 
	
	   String nextLine() 
	   { 
	       String str = ""; 
	       try
	       { 
	           str = br.readLine(); 
	       } 
	       catch (IOException e) 
	       { 
	           e.printStackTrace(); 
	       } 
	       return str; 
	   }
	
		public Character charAt(int i) {
			// TODO Auto-generated method stub
			return null;
		}
	
		public BigInteger nextBigInteger() {
			// TODO Auto-generated method stub
			return null;
		} 
	} 	
		public static void main(String[] args) {
			FastReader s=new FastReader();
			String n = s.next();
			int c1=0,c2=0;
			for(int i=0;i<n.length();i++) {
				if(n.charAt(i)=='A')c1++;
				else if(n.charAt(i)=='B')c2++;
					
			}
			if(c1>0 && c2>0)System.out.println("Yes");
			else System.out.println("No");
			

		}
	}
