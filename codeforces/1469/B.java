

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
			int[] r = new int[n];
			
			for(int i=0;i<n;i++)r[i]=s.nextInt();
			int m=s.nextInt();
			int[] b = new int[m];
			for(int i=0;i<m;i++)b[i]=s.nextInt();
			int[] sum1=new int[n+1],sum2=new int[m+1];
			int m1=0,m2=0;
			for(int i=0;i<n;i++) {
				sum1[i+1]=sum1[i]+r[i];
				m1=Math.max(sum1[i+1],m1);
			}
			for(int i=0;i<m;i++) {
				sum2[i+1]=sum2[i]+b[i];
				m2=Math.max(sum2[i+1],m2);
			}
			System.out.println(m1+m2);
			
	}
}
}

