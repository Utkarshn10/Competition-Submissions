

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
//		int r1 =s.nextInt();
//		int c1 =s.nextInt();
//		int r2 =s.nextInt();
//		int c2 =s.nextInt();
//		if(r1==c1&&c1==c2 && c2==r2)System.out.println(0);
//		else if(r1==c1&&r2==c2)System.out.println(1);
//		else if(r1==c1)System.out.println(2);
//		else {
//			if(r1+c1==c2+r2)System.out.println(1);
//			else if(r1-c1==r2-c2)System.out.println(1);
//			else if(Math.abs(r1-r1)+Math.abs(c1-c2)<3 || Math.abs(r1-r1)+Math.abs(c1-c2)==3 )System.out.println(1);
//			else System.out.println(3);
//		}
//		int a  =s.nextInt();
//		int b  =s.nextInt();
//		int c  =s.nextInt();
//		
//		double a1 =((double)a/(double)(a+b+c));
////		System.out.println(a1);
//		double b1 =((double)b/(double)(a+b+c));
//		double c1 =((double)c/(double)(a+b+c));
//		System.out.println((double)(100-a)*(a1)+(100-b)*b1+(100-c)*c1);
	public static void main(String[] args) {
		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			int[] ar = new int[n];
			int[] b = new int[n+1];
			List<Integer> l = new ArrayList<>();
			Map<Integer,Integer> m= new HashMap<Integer,Integer>();
			int f=0;
			for(int i=0;i<n;i++) {
				ar[i] = s.nextInt();
			}
			Arrays.fill(b, 1);
			b[ar[0]]--;

			if (b[ar[0]] != b[ar[n - 1]])
				b[ar[n - 1]]--;
			for(int i=1;i<n;i++) {
				if(ar[i]!=ar[i-1])b[ar[i]]++;
			}
			if(b[ar[0]]!=b[ar[n-1]])b[ar[0]]++;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
//				System.out.println(b[ar[i]]);
				min=Math.min(min, b[ar[i]]);
			}
			
			System.out.println(min);
		}

			
	}	

}
		
	
		