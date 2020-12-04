
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

//	      int a = 3125, m = 9987; 
	 //   System.out.println( modInverse(a, m));
	   
	   
	static boolean check(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			if(n%2==0)
			{
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==j || i+j==n-1)System.out.print("1 ");
						else System.out.print("0 ");
					}
					System.out.println();
				}
			}
			else {
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(i==j || i+j==n-1 || (i==n/2-1 && j==n/2)||(i==n/2 && j==n/2+1) )System.out.print("1 ");
						else System.out.print("0 ");
					}
					System.out.println();
				}
			}
		}
	}
}

	
//
//}
		
	
		