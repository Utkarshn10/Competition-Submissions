

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
			int N = s.nextInt();
			int[] Arr = new int[N];
			int[] Person = new int[N]; 
			int Min = 0;
			
			for(int j=0;j<N;j++)
			{
				int a = s.nextInt();
				Person[a-1] = j+1;
				Arr[a-1]++;
			}
			for(int j=0;j<N;j++)
			{
				if(Arr[j]==1)
				{
					Min=Person[j];
					break;
				}
			}
			if(Min>0)System.out.println(Min);
			else System.out.println(-1);
//			int n = s.nextInt();
//			int[] ar = new int[n];
//			int[] ar1 = new int[1000000];
//			int[] se = new int[1000000];
//			
//	
//			
//			for(int i=0;i<n;i++) {
//				ar[i]=s.nextInt();
//				se[ar[i]-1]++;
//				ar1[ar[i]-1]=i+1;
//			}
//			int o=-1;
//			for(int i=0;i<n;i++) {
////				System.out.println(i);
//				if(se[i]==1) {
//					o=ar1[i];
//					break;
//				}
//			}
//			System.out.println(o);
			
		

		}

			
	}	

}
		
	
		