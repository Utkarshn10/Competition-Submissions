


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;	
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;


import java.io.DataInputStream;
import java.io.FileInputStream;

public class main1 {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();

		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		public Character charAt(int i) {
			// TODO Auto-generated method stub
			return null;
		}

		// public BigInteger nextBigInteger() {
		// // TODO Auto-generated method stub
		// return null;
		// }
	}
	
    static int dp[][] = new int[1001][1001]; // 2D matrix
    static List<Integer> l = new ArrayList<>();
    static int c=0;
    public static int isPal(String s, int i, int j)
    {
        // Base condition
        if (i > j)
            return 1;
      
        // check if the recursive tree
        // for given i, j
        // has already been executed
        if (dp[i][j] != -1)
            return dp[i][j];
      
        // If first and last characters of 
        // substring are unequal
        if (s.charAt(i) != s.charAt(j))
            return dp[i][j] = 0;
      
        // memoization
        return dp[i][j] = isPal(s, i + 1, j - 1); 
    }
      
    public static int countSubstrings(String s)
    {
        for (int[] row: dp)
        {
            Arrays.fill(row, -1);
        }
        int n = s.length();
        int count = 0;
      
        // 2 for loops are required to check for
        // all the palindromes in the string.
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) 
            {
                // Increment count for every palindrome
                if (isPal(s, i, j) != 0) {
                    count++;
                    if(l.contains(i) || l.contains(j))c++;
                    else{
                    	l.add(i);
                    	l.add(j);
                    }
                    System.out.println(l);
                 }
            }
        }
       
        // return total palindromic substrings
        return count;
    }
	public static void main(String[] args) throws Exception {
		FastReader s = new FastReader();
		int t=s.nextInt();
		while(t-->0) {
			int x=s.nextInt();
			int n=s.nextInt();
			int m=s.nextInt();
//			while(x>0 && n>0 && m>0) {
//				int p1 =(int) Math.floor((double)x/(double)2)+10;
////				System.out.println(p1);
//				int p2=x-10;
//				if(p1<=p2) {
//					x=p1;
//					n--;
//				}
//				else {
//					x=p2;
//					m--;
//					System.out.println("rep gko");
//				}
//				System.out.println(x);
//			}
			if(x-m*10<=0) {
				System.out.println("YES");
				continue;
			}
			while(x>0 && n>0) {
				int p1 =(int) Math.floor((double)x/(double)2)+10;
				x=p1;
				n--;
//				System.out.println(x);
			}
			while(x>0 && m>0) {
				x-=10;
				m--;
			}
			
//			System.out.println(x);
			
//			System.out.println(x);
			System.out.println(x<=0?"YES":"NO");
			
			
		}
		
		
	}
}



