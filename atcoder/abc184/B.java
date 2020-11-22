

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

	public static void main(String[] args) {
		FastReader s=new FastReader();
		int n =s.nextInt();
		int x = s.nextInt();
		
		String a =s.next();
		
		for(int i=0;i<a.length();i++) {
			if(x==0 && a.charAt(i)=='x')continue;
			else if(a.charAt(i)=='x')x--;
			else x++;
		}
		System.out.println(x);
	}	

}
		
	
		