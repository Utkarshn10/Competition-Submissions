
		
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

		public static void main(String[] args) {
				FastReader s=new FastReader();
				int n=s.nextInt();
				int[] a =new int[n];
				int c=0,f=0,msf=0,p=0;
				for(int i=0;i<n;i++)
				{
					a[i]=s.nextInt();
					if(a[i]==0)msf=0;
					else msf++;
					if(msf>=c) {
						c=msf;
					}
					if(f==0 && a[i]==0) {
						p=i;
						f=1;
					
					}
				}
				
				if(a[0]==1 && a[n-1]==1) {
					int c1=0;
					for(int i=n-1;i>=0 && a[i]!=0;i--) {
						c1++;
					}
					c=Math.max(c, p+c1);
//					System.out.println( p+c1);
				}
				System.out.println(c);	
		}
	}	

	
