
		
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
		
		public static void main(String[] args) throws IOException {
			FastReader s=new FastReader();
				int n =s.nextInt();
				int m = s.nextInt();
				int[][] a = new int[n][m];
				int min=Integer.MAX_VALUE;
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++) {
						a[i][j]=s.nextInt();
						min=Math.min(min,a[i][j]);
					}
				}
				int c=0;
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++) {
						if(min!=a[i][j])c+=(a[i][j]-min);
					}
				}
				System.out.println(c);
		}
		}
