
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
			int[] a=new int[n];
			int[] a1=new int[2];
			long sum=0;
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
				a1[i%2]+=a[i]-1;
				sum+=a[i];
			}
			for(int i=0;i<n;i++) {
				int x = (int)(Math.log(a[i])/Math.log(2.0));
				System.out.print((int)Math.pow(2, x)+" ");
			}
			System.out.println();
	}
}
}
