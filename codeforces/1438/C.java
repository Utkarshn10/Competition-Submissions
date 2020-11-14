	
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
				int m =s.nextInt();
				int[][] ar = new int[n][m];
				int[][] b = new int[n][m];
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++) {
						ar[i][j]=s.nextInt();
						b[i][j]=ar[i][j]%2;
						
					}
				}
				int flag=0;
				for(int i=0;i<n;i++) {
					for(int j=0;j<m;j++) {
						if((i+j)%2!=b[i][j]) ar[i][j]++; 
						System.out.print(ar[i][j]+" ");
							
					}
					System.out.println();
				}
			}
				
			}
			
			
			
		
		}

