	
		
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
		} 	 public static int isPairSum(int A[],int k, int N, int X)
	    {
	        // represents first pointer
	        int i = 0;
	 
	        // represents second pointer
	        int j = N - 1;
	 
	        while (i < j && i!=k && i!=k+1) {
	 
	            // If we find a pair
	            if (A[i] + A[j] == X)
	                return 1;
	 
	            // If sum of elements at current
	            // pointers is less, we move towards
	            // higher values by doing i++
	            else if (A[i] + A[j] < X)
	                i++;
	 
	            // If sum of elements at current
	            // pointers is more, we move towards
	            // lower values by doing j--
	            else
	                j--;
	        }
	        return 0;
	    }
			public static void main(String[] args) {
				FastReader s=new FastReader();
				int t = s.nextInt();
				while(t-->0) {
					int n = s.nextInt();
					int c0 = s.nextInt();
					int c1 = s.nextInt();
					int h = s.nextInt();
					String se =s.next();
					int  s0 = 0,s1=0;
					for(int i=0;i<se.length();i++) {
						if(se.charAt(i)=='0')s0++;
						else s1++;
					}
					
					int b=0,b1=0,b2=0;
					int c=s1*c1+s0*c0;
							int h1=h*s1;
							b1=h1+(s1+s0)*c0;
//							System.out.println(h);
						
							int h2=h*s0;
							b2=h2+(s1+s0)*c1;
//							System.out.println(h1+" "+h2+" "+ c+" "+b1+" "+b2);
						b = Math.min(b1, b2);
						b = Math.min(c, b);
					System.out.println(b);
					
					
				}
				
		
					
				}
				
				
				
			
			}
	
