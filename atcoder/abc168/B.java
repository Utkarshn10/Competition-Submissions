import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
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
	    } 
	 static int divisors(long x) {
		    long limit = x;
		    int numberOfDivisors = 0;

		    if (x == 1) return 1;

		    for (int i = 1; i < limit; ++i) {
		        if (x % i == 0) {
		            limit = x / i;
		            if (limit != i) {
		                numberOfDivisors++;
		            }
		            numberOfDivisors++;
		        }
		    }

		    return numberOfDivisors;
		} 
	public static void main(String[] args)throws IOException  {
		FastReader s=new FastReader();		
		int k = s.nextInt();
		String x = s.next();
		if(x.length()<=k) {
			for(int i=0;i<x.length();i++) {
				System.out.print(x.charAt(i));
			}
		}
		if(x.length()>k) {
			for(int i=0;i<k;i++) {
				System.out.print(x.charAt(i));
			}
			System.out.println("...");
		}
	}
}