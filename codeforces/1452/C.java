

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
//	   int n =s.nextInt();
//		int[] a = new int[n];
//		List<Integer> c = new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			a[i]=s.nextInt();
//			
//		}
//		Arrays.sort(a);
//		int m = a[n-1];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			if(a[i]!=m)sum+=a[i];
//		}
//		
//		if(m==sum-m)System.out.println(0);
//		else  {
//		System.out.println(Math.abs(sum-m));
//		}
	public static void main(String[] args) {
		FastReader s=new FastReader();
		int t=s.nextInt();
			while(t-->0) {
				String a = s.next();
				int f1=0,f2=0,c1=0,c2=0,c3=0,c4=0,m1=0,m2=0;
				for(int i=0;i<a.length();i++) {
					if(a.charAt(i)=='(') {
						c1++;
						f1=1;
					}
					else if(a.charAt(i)=='[') {
						c2++;
						f2=1;
					}
					else if(a.charAt(i)==')' && c1>0) {
						c3++;
						int m = Math.min(c1, c3); 
						m2 += m;
						c1-=m;
						c3-=m;
					}
					else if(a.charAt(i)==']' && c2>0) {
						c4++;
						int m = Math.min(c2, c4);
						m1 +=m;
						c2-=m;
						c4-=m;
					}
					
				}
 			System.out.println(m1+m2);
			
			
		}
	}	

}
		
	
		