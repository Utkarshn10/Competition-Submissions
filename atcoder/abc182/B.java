
	
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
//			String n = s.next();
//			
//			int sum=0,c=0,count=0,c1=0;
//			for(int i=0;i<n.length();i++) {	
//				sum+=n.charAt(i)-'0';
//				c++;
//				
//				if(sum%3==0) {
//					System.out.println(sum);
//					count++;
//				}
//				else{
//					c1++;
//				}
//				
//			}
//			int p =sum%3;
//			if(c1>0 && count<=n.length()-1) {
//				if(c1<(n.length()-count))System.out.println(c1);
//				else System.out.println(count);
//				
//			}
//			else if(sum%3==0)System.out.println(0);
//			else System.out.println(-1);
			
			int n = s.nextInt();
			int[] a =new int[n];
		
			for(int i=0;i<n;i++) {
				a[i] = s.nextInt();
			}
			int max=0,m=0;
		
			for(int i=2;i<1000;i++) {
					int c=0;
					for(int j=0;j<n;j++) {
						if( a[j]%i==0) {
							c++;
						}
					}
					if(c>max) {
						max=c;
						m=i;
					}
			}
		System.out.println(m);
		}
	
	}
