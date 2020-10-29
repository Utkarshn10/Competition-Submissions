
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
		Long n = s.nextLong();
		List<Long> a = new ArrayList<>(); 
		for(long i=1;i*i<=n;i++) {
			if(n%i==0) {
				a.add(i);
				if(i!=n/i)a.add(n/i);
			}
		}
		
		Collections.sort(a);
		for(long x:a)System.out.println((long)x);

				
	}	

	}
		
	
		
				
				
				
				
				
				
				
				
				        
				    
				
				      
				 