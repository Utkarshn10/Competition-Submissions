
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class HelloWorld {
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
	public static void main(String[] args) {
		FastReader s=new FastReader();
		int t = s.nextInt();
		while(t-->0) {
			int m = s.nextInt();
			int n = s.nextInt();
			int min = Math.min(m, n);
			if(m==n)System.out.println((long)(m^min)+(n^min));
			else if(min%2==0) {
				System.out.println((long)(m^min)+(n^min));
			}
			else {
				System.out.println(Math.min((long)(m^(min-1))+(n^(min-1)),(long)(m^(min))+(n^(min))));
			}
		}
	}

}
