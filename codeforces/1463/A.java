
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

	
	public static void main(String[] args) throws Exception {
		FastReader s = new FastReader();
		int t= s.nextInt();
		while(t-->0) {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			long sum=a+b+c;
			int min=Math.min(a, b);
			min=Math.min(c, min);
		
			if(sum%9!=0)System.out.println("NO");
		
			
			else if(min>=Math.floor((double)sum/(double)9))System.out.println("YES");
			else System.out.println("NO");
			
	}
}
}

