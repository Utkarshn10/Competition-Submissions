	
	
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
			StringBuffer se = new StringBuffer(s.next());
			int q = s.nextInt();
			int flag=0,c=0;
			StringBuffer a = new StringBuffer("");

			StringBuffer b = new StringBuffer("");
			boolean curr=false;
			while(q-->0) {
				int t=s.nextInt();
				if(t==1) {
					curr=!curr;
				}
				else {
					int f= s.nextInt();
					StringBuffer g = new StringBuffer(s.next());
					
						if((f==1 && !curr) || (f==2 && curr) ) {
							b.insert(b.length(), g);
						}
						else {
							a.insert(a.length(), g);
						}
						
					}
					
				}
			
			if(curr) {
				 StringBuffer a1 = new StringBuffer(a);
			     a1.reverse();
			     System.out.print(a1);
			     StringBuffer sbr = new StringBuffer(se);
			     sbr.reverse();
			     System.out.print(sbr);
			     System.out.println(b);
			}
			else {
				 
			     StringBuffer b1 = new StringBuffer(b);
			     b1.reverse();
			     System.out.print(b1);
			    System.out.print(se);
				System.out.println(a);
			   
			}
		
		}
	}
