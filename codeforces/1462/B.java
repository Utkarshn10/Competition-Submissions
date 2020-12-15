	
		
		import java.io.BufferedReader;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.math.BigInteger;
	import java.util.ArrayList;
	import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
	import java.util.List;
import java.util.Scanner;
import java.util.Set;
	import java.util.StringTokenizer;
	import java.io.DataInputStream; 
	import java.io.FileInputStream; 

		
		
		
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

		public static void main(String[] args) throws IOException {
			FastReader s=new FastReader();
				int t=s.nextInt();
				while(t-->0) {
					int n=s.nextInt();
					String se=s.next();
					char[] c=se.toCharArray();
					if((c[0]=='2'&&c[1]=='0'&&c[2]=='2'&& c[3]=='0')||c[n-4]=='2'&&c[n-3]=='0'&&c[n-2]=='2'&& c[n-1]=='0')System.out.println("YES");
//					else if(c[n-1]=='0' && c[0]=='2'&& c[1]=='0'&& c[0]=='2') {
//						
//						System.out.println("YES");
//						
//					}
					else if((c[n-1]=='0'&&c[n-2]=='2'&&c[n-3]=='0' && c[0]=='2')||(c[1]=='0'&& c[0]=='2'&&c[2]=='2'&&c[n-1]=='0')|| (c[1]=='0'&& c[0]=='2'&&c[n-2]=='2'&&c[n-1]=='0'))System.out.println("YES");
					else System.out.println("NO");
						
				}
			
				
		
				
				
		}
	}
	
