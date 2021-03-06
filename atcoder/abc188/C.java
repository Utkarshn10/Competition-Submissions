
		import java.io.BufferedReader;
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.InputStream;
		import java.io.InputStreamReader;
		import java.io.PrintWriter;
		import java.math.BigInteger;
	import java.util.ArrayDeque;
	import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collections;
	import java.util.Deque;
	import java.util.HashMap;
		import java.util.HashSet;
		import java.util.LinkedList;
		import java.util.List;	
		import java.util.Map;
		import java.util.Queue;
		import java.util.Scanner;
		import java.util.Set;
		import java.util.StringTokenizer;
	public class Main {
			static int mx= 200005 ;
			static void solve() throws Exception{
				int n = s.nextInt();
				n=(1<<n);
				int[] a = new int[n];
				for(int i=0;i<n;i++) {
					a[i]=s.nextInt();
				}
				int pos=0,pos2=n/2;
				for(int i=0;i<=n/2-1;i++) {
					if(a[i]>a[pos]) {
						pos=i;
					}
				}
				for(int i=n/2;i<n;i++) {
					if(a[i]>a[pos2]) {
						pos2=i;
					}
				}
				if(a[pos]<a[pos2])System.out.println(pos+1);
				else System.out.println(pos2+1);
				
		}

		public static void main(String[] args) throws Exception {
				s = new MScanner(System.in);
				pw = new PrintWriter(System.out);
				int tc = 1;
//				tc	=s.nextInt();
				for (int test = 1; test <= tc; test++) {
						solve();
				}
				pw.flush();
		}
			
			static PrintWriter pw;
			static MScanner s;
			static class MScanner {
				StringTokenizer st;
				BufferedReader br;
				public MScanner(InputStream system) {
					br = new BufferedReader(new InputStreamReader(system));
				}
			 	public MScanner(String file) throws Exception {
					br = new BufferedReader(new FileReader(file));
				}
			 
				public String next() throws IOException {
					while (st == null || !st.hasMoreTokens())
						st = new StringTokenizer(br.readLine());
					return st.nextToken();
				}
				public int[] intArr(int n) throws IOException {
					int[] in = new int[n];
					for (int i = 0; i < n; i++)
						in[i] = nextInt();
					return in;
				}
			 	public long[] longArr(int n) throws IOException {
					long[] in = new long[n];
					for (int i = 0; i < n; i++)
						in[i] = nextLong();
					return in;
				}
				public int[] intSortedArr(int n) throws IOException {
					int[] in = new int[n];
					for (int i = 0; i < n; i++)
						in[i] = nextInt();
					shuffle(in);
					Arrays.sort(in);
					return in;
				}
				public long[] longSortedArr(int n) throws IOException {
					long[] in = new long[n];
					for (int i = 0; i < n; i++)
						in[i] = nextLong();
					shuffle(in);
					Arrays.sort(in);
					return in;
				}
			 	public Integer[] IntegerArr(int n) throws IOException {
					Integer[] in = new Integer[n];
					for (int i = 0; i < n; i++)
						in[i] = nextInt();
					return in;
				}
				public Long[] LongArr(int n) throws IOException {
					Long[] in = new Long[n];
					for (int i = 0; i < n; i++)
						in[i] = nextLong();
					return in;
				}
				public String nextLine() throws IOException {
					return br.readLine();
				}
				public int nextInt() throws IOException {
					return Integer.parseInt(next());
				}
				public double nextDouble() throws IOException {
					return Double.parseDouble(next());
				}
				public char nextChar() throws IOException {
					return next().charAt(0);
				}
				public long nextLong() throws IOException {
						return Long.parseLong(next());
				}
			 	public boolean ready() throws IOException {
						return br.ready();
				}
				public void waitForInput() throws InterruptedException {
						Thread.sleep(3000);
				}
			}
				static void shuffle(int[] in) {
					for (int i = 0; i < in.length; i++) {
						int idx = (int) (Math.random() * in.length);
						int tmp = in[i];
						in[i] = in[idx];
						in[idx] = tmp;
					}
			}
			 	static void shuffle(long[] in) {
			 		for (int i = 0; i < in.length; i++) {
						int idx = (int) (Math.random() * in.length);
						long tmp = in[i];
						in[i] = in[idx];
						in[idx] = tmp;
					}
				}
			}