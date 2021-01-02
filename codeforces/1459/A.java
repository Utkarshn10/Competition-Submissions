


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
import java.util.LinkedList;
import java.util.List;	
import java.util.Map;
import java.util.Queue;
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
		int t=s.nextInt();
		while(t-->0) {
			int n=s.nextInt();
			String r = s.next();
			String b = s.next();
			
			
			char[] r1 = r.toCharArray();
			char[] b1 = b.toCharArray();
			int i=0,j=0,c=0;
		
	
//			System.out.println(c);
			int pr=1,pb=1,cr=0,cb=0;
			for(i=n-1;i>=0;i--) {
				if(r1[i]>b1[i])cr++;
				else if(r1[i]<b1[i])cb++;
			}
			if(cb==cr) {
				System.out.println("EQUAL");
			}
			else if(cb>cr)System.out.println("BLUE");
			else System.out.println("RED");
		}	
	}
}
