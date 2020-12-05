
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
	   
	   

	public static void main(String[] args) {
		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
			}
			long ans=0;
			for(int i=1;i<n;i++) {
				ans+=Math.abs(a[i]-a[i-1]);
			}
			int max = Math.max(Math.abs(a[0]-a[1]), Math.abs(a[n-1]-a[n-2]));
			for(int i=1;i<n-1;i++) {
				max = Math.max(max, Math.abs(a[i]-a[i-1])+Math.abs(a[i]-a[i+1])-Math.abs(a[i+1]-a[i-1]));
			}
			System.out.println(ans-max);
 		}

		
			
	}
}

	
//
//}
		
	
		