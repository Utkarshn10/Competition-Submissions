


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
			int n=s.nextInt();
			int[] a = new int[n];
			int max=0,min=Integer.MAX_VALUE,p1=0,p2=0;
			int f=0;
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
				if(f==0 && i>0 && Math.abs(a[i]-a[i-1])>=2) {
					f=1;
					p1=i;
					p2=i+1;
				}
			}
			if(f!=1) {
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
				System.out.println(p1+" "+p2);
			}
		}
}
}


