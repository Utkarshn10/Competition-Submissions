	

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
		
		   static int partition(int arr[], int low, int high) 
		    { 
		        int pivot = arr[high];  
		        int i = (low-1); // index of smaller element 
		        for (int j=low; j<high; j++) 
		        { 
		            // If current element is smaller than the pivot 
		            if (arr[j] < pivot) 
		            { 
		                i++; 
		  
		                // swap arr[i] and arr[j] 
		                int temp = arr[i]; 
		                arr[i] = arr[j]; 
		                arr[j] = temp; 
		            } 
		        } 
		  
		        // swap arr[i+1] and arr[high] (or pivot) 
		        int temp = arr[i+1]; 
		        arr[i+1] = arr[high]; 
		        arr[high] = temp; 
		  
		        return i+1; 
		    } 
		  
		  


//		   int m = s.nextInt();
//			int[]a = new int[n];
//			int[]a1 = new int[n];
//			List<Integer> l = new ArrayList<>();
//			for(int i=0;i<n;i++) {
//				a[i]=s.nextInt();
//				a1[i]=a[i];
//			}
//			Arrays.sort(a1);
//			int c=0;
//			for(int i=0;i<m;i++) {
//				int p1= s.nextInt();
//				int p2=s.nextInt();
//				a = sort(a, 0, p1); 
//				for(int j=0;j<n;j++) {
//					if(a[j]==a1[j])c++;
//				}
//				if(c==n) {
//					System.out.println(p2);
//					break;
//				}
//			}
		   
		   //TO PRINT SINGLE CHAR N TIMES
		   //		   n+=String.join("", Collections.nCopies(N, "R"));
			public static void main(String[] args) {
				FastReader s=new FastReader();
				int n  =s.nextInt();
				int k = s.nextInt();
				String se = s.next();
			
				int x=0;
				long ans=0;
				Set<Character> set = new HashSet<>();
				for(int i=0;i<k;i++) {
					set.add(s.next().charAt(0));
			
				}
				
				for(int i=0;i<se.length();i++) {
					if(!set.contains(se.charAt(i))) {
						ans+=(x*(long)(x+1))/2;
						x=0;
					}
					else x++;
				}
				ans+=x*(long)(x+1)/2;
				System.out.println(ans);
		}}
		 
		
	//
	//}
			
		
			