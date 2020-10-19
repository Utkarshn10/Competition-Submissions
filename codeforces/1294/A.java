
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
			int[] ar = new int[4];
			int max=0;
			for(int i=0;i<4;i++) {
				ar[i]=s.nextInt();
				if(i<3)max=Math.max(max, ar[i]);
			}
			int sum=Math.abs(max-ar[0])+Math.abs(max-ar[1])+Math.abs(max-ar[2]);
//			System.out.println(sum);
			if(sum>ar[3])System.out.println("NO");
			else {
				if((ar[3]-sum)%3==0)System.out.println("YES");
				else System.out.println("NO");
			}
		}
		
			

	}

}
