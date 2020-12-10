
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.math.BigInteger;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
	import java.util.Map;
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
	
	//	      int a = 3125, m = 9987; 
		 //   System.out.println( modInverse(a, m));
	//	 	GIVE BIT AT A PARTICULAR POSITION 
	//			if((n&(1<<pos))!=0) System.out.println(1);
	//			else System.out.println(0);
	//		FOR SET
	//			System.out.println((n|(1<<pos))); 
	//		FOR CLEAR 
	//			System.out.println((n & ~(1<<pos)));
		//  FOR UPDATE
	//		 int k = (n  &~(1<<t)); CLEAR
	//		 System.out.println((k | (1<<t))); SET	   
		   
	//	   int t = s.nextInt();
	//		while(t-->0) {
	//			int n = s.nextInt();
	//		}	
		  
			public static void main(String[] args) {
				FastReader s=new FastReader();
				int t = s.nextInt();
				while(t-->0) {
					int n = s.nextInt();
					List<Integer> se1 = new ArrayList<>();
					for(int i=0;i<2*n;i++) {
						int p=s.nextInt();
						if(!se1.contains(p)) {
							se1.add(p);
//							System.out.println(p);
						}
//						System.out.println(i);
					}
					for(int i=0;i<n;i++) {
						System.out.print(se1.get(i)+" ");
					}
					System.out.println();
					
					
				}
			}			
		}
		 
		
	//
	//}
			
		
			