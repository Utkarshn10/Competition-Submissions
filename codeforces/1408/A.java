
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public  class FibinacciSeries 
{	
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
	static void bubble_sort(int[] arr,int n) {
		for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args) throws IOException {
		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int n = s.nextInt();
			int[] a =new int[n];
			int[] b  =new int[n];
			int[] c  =new int[n];
			int p=3,k=0;
			int[] g = new int[3*n+1];
			for(int i=0;i<n;i++) {
				a[i] = s.nextInt();
				
			}	
			for(int i=0;i<n;i++) {
				b[i] = s.nextInt();
				
			}	
			for(int i=0;i<n;i++) {
				c[i] = s.nextInt();
				
				
			}
			g[0]=a[0];
		
			k=1;
			for(int i=1;k<n && i<n ;i++) {
				if(k==i && g[k-1]!=a[i]) {
					if(k==n-1 && g[0]==a[i])continue;
					else g[k++]=a[i];
				}
				else if( k==i && g[k-1]!=b[i] && g[k%n-1]!=b[i]) {
					if(k==n-1 && g[0]==b[i])continue;
					else g[k++]=b[i];
				}
				else if(k==i && g[k-1]!=c[i] && g[k%n-1]!=c[i]) {
					if(k==n-1 && g[0]==c[i])continue;
					else g[k++]=c[i];
				}
				
			}
			for(int i=0;i<n;i++) {
				if(g[i]==0) {
					if(g[i-1]!=a[i] && a[i]!=g[0])System.out.println(a[i]);
					else if(g[i-1]!=b[i] && b[i]!=g[0])System.out.println(b[i]);
					else if(g[i-1]!=c[i] && c[i]!=g[0])System.out.println(c[i]);
				}
				else System.out.print(g[i]+" ");
			}
			System.out.println();
						
			
		}
		
	}    
}	    	

			
			
			
			
			
			
			
			
			        
			    
			
			      
			 