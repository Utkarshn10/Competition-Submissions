
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
	   static Map<Integer,Integer> ar = new HashMap<>();
	   static boolean[] v = new boolean[100005];
	   static void dfs(int i) {
		   if(!v[i]) {
			   v[i]=true;
			   for(int a: ar.values()) {
				   dfs(a); 	
			   }
		   }
	   }
	   static int modInverse(int a, int m) 
	    { 
	        int m0 = m; 
	        int y = 0, x = 1; 
	  
	        if (m == 1) 
	            return 0; 
	  
	        while (a > 1) { 
	            // q is quotient 
	            int q = a / m; 
	  
	            int t = m; 
	  
	            // m is remainder now, process 
	            // same as Euclid's algo 
	            m = a % m; 
	            a = t; 
	            t = y; 
	  
	            // Update x and y 
	            y = x - q * y; 
	            x = t; 
	        } 
	  
	        // Make x positive 
	        if (x < 0) 
	            x += m0; 
	  
	        return x; 
	    } 
//	      int a = 3125, m = 9987; 
	 //   System.out.println( modInverse(a, m));
	public static void main(String[] args) {

		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			int[] ar = new int[n];
			int f=0;
			for(int i=0;i<n;i++) {
				ar[i]=s.nextInt();
				
			}
			Arrays.sort(ar);
			for(int i=0;i<n && f==0;i++) {
				if(i>0&&ar[i]-ar[i-1]>1)f=1;
			}
			
			if(f==1)System.out.println("NO");
			else System.out.println("YES");
		}
	}
}	
//
//}
		
	
		