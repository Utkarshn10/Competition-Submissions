
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
	static int solve(int[] a,int size) {
		int msf=Integer.MIN_VALUE,max=0;
		for(int i=0;i<size;i++) {
			max+=a[i];
			if(msf<max)msf=max;
			if(max<0)max=0;
		}
	    return msf;  
	}
	public static void main(String[] args) {
		FastReader s=new FastReader();
			int t = s.nextInt();
			while(t-->0) {
				int n = s.nextInt();
				int[] ar = new int[4];
				ar[0]=1;
				ar[1]=2;
				ar[2]=3;
				ar[3]=4;
				int num=0;
				int j = n%10;
				while(n>0) {
					num++;
					n/=10;
				}
				int p =0;
				while(num>1) {
					p+=ar[num-1];
					num--;
				}
				System.out.println((j-1)*10+p+1);
			}
			
		}
		

		
			

	}


