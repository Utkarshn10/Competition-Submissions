
		
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
		   static int digSum(int n) 
		    { 
		        int sum = 0, rem = 0; 
		          
		        while (n>0) { 
		            rem = n % 10; 
		            sum += rem; 
		            n /= 10; 
		        } 
		          
		        return sum; 
		    } 
		     static int check(int n) {
		    	 List<Integer>l=new ArrayList<>();
		    	 while(n>0) {
		    		 int p=n%10;
		    		 n/=10;
		    		 if(l.contains(p)) {
		    			 return -1;
		    		 }
		    		 l.add(p);
		    	 }
		    	 return 1;
		     }
		   
		    static int findX(int n) 
		    { 
		        for (int i = 1; i <= 1000000000; i++)  
		            if (check(i)==1 && digSum(i) == n) 
		                return i; 
		        return -1; 
		    } 
		public static void main(String[] args) throws IOException {
			FastReader s=new FastReader();
				int t=s.nextInt();
				while(t-->0) {
					int n=s.nextInt();
					String se=s.next();
					int f=0;
					for(int i=0;i<=4;i++) {
						int sec=4-i;
						
						String g=se.substring(0,i)+se.substring(n- sec);
						if(g.equals("2020")) {
							f=1;
							break;
						}
						
					}
					System.out.println(f==1?"YES":"NO");
				}
		}
	}
	
