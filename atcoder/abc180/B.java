
	import java.io.BufferedReader; 
	import java.io.IOException; 
	import java.io.InputStreamReader;
	import java.math.BigInteger;
	import java.util.*;
	
	
	public  class Main 
	{		   static class FastReader 
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
//		long n = s.nextLong();
//		int  v=1;
//		if(n%2!=0)v=2;
//		for(int i=1;i<=n/2;i+=v) {
//			if(n%i==0)System.out.println(i);
//		}
//		System.out.println(n);
		int n = s.nextInt();
		int[] ar =  new int[n];
		long m=0,e=0,c=0;
		for(int i=0;i<n;i++) {
			ar[i] = s.nextInt();
			c = Math.max(Math.abs(ar[i]),c);
			e +=ar[i]*(long)ar[i];
			m+=Math.abs(ar[i]);
		}
		
	
		System.out.println(m);
		System.out.println(Math.sqrt(e));
		System.out.println(c);
				
	}	

	}
		
	
		
				
				
				
				
				
				
				
				
				        
				    
				
				      
				 