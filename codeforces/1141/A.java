
		
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
				
					int a=s.nextInt();
					int b = s.nextInt();
					int c=0;
					int p = b/a;
					if(p==1 && b%a==0)System.out.println(0);
					else if(b%a!=0)System.out.println(-1);
					else {
						int f=0;
						while(p!=1 && f==0) {
//							System.out.println(p);
							if(p%2==0)p/=2;
							else if(p%3==0)p/=3;
							else f=1;
							c++;
						}
						if(f==1)System.out.println(-1);
						else System.out.println(c);
					}
		}
	}	

	
