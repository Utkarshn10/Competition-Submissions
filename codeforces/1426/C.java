
		
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.math.BigInteger;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.List;
import java.util.Scanner;
import java.util.Set;
	import java.util.StringTokenizer;

	
	
		
		
		
		public class main1 {
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
			
		static int gcd(int a, int b)
		{
		    if (b==0)
		    return a;
		    return gcd(b, a%b);
		}
		static int pour(int fromCap, int toCap, int d)
		{

		    int from = fromCap;
		    int to = 0;
		 

		    int step = 1; 

		    while (from != d && to != d)
		    {
		        int temp = Math.min(from, toCap - to);
		        to   += temp;
		        from -= temp;
		        step++;
		        if (from == d || to == d)
		            break;
		 
		        if (from == 0)
		        {
		            from = fromCap;
		            step++;
		        }
		
		        if (to == toCap)
		        {
		            to = 0;
		            step++;
		        }
		    }
		    return step;
		}
		static int minSteps(int m, int n, int d)
		{

		    if (m > n) {
		    	int temp= m;
		    	m=n;
		    	n=temp;
		    }
	
		    if (d > n) return -1;

		    if ((d % gcd(n,m)) != 0)
		        return -1;
			
		    return Math.min(pour(n,m,d),   // n to m
		               pour(m,n,d));  // m to n
		}

		public static void main(String[] args) {
				FastReader s=new FastReader();
				int t = s.nextInt();
				while(t-->0) {
					int n = s.nextInt();
					long ans=Integer.MAX_VALUE;
					for(int x=1;x*x<=n;x++) {
						 ans=Math.min(ans, (x-1)+(n-1)/x);
					}
					System.out.println(ans);
				}
		}
	}	

	
