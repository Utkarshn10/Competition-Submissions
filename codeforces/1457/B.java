

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;



public class A {
	static int mx= 200005 ;
	  
	static void solve() throws Exception{
		MScanner sc = new MScanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int max=0;
		int[] a = new int[n];
		int[] cnt = new int[101];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int d=Integer.MAX_VALUE;
		for(int i=1;i<=100;i++) {
			int j=0,c=0;
			while(j<n) {
				if(a[j]!=i) {
					j+=k;
					c++;
					continue;
				}
				j++;
			}
			d=Math.min(c,d);
		}
		System.out.println(d);
		
		
		
	}


	
	static int gcd(int a,int b) {
		if(a==0)return b;
		return gcd(b%a,a);
	}
public static void main(String[] args) throws Exception {
		s = new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc = 1;
		
		tc	=s.nextInt();
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
		public void pArr(int[] in,int n) throws IOException {
			
			for (int i = 0; i < n; i++)
				System.out.println(in[i]);
			
		}
		public void pLis(ArrayList<Integer> l) throws IOException {
			
			for (int i = 0; i < l.size(); i++)
				System.out.println(l.get(i));
			
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