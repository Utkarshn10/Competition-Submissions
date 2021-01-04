
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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
	
public class main1 {
	
	

	static void main() throws Exception{
		int n=s.nextInt();
		
		int[] cnt = new int[n+1];
		List<Integer> l =new ArrayList<>();
		l.add(s.nextInt());
		int j=1;
		for(int i=1;i<n;i++) {
			int p=s.nextInt();
			if(l.get(j-1)!=p) {
				l.add(p);
				j++;
			}
		}
		int c=Integer.MAX_VALUE;
		n=l.size();
		Arrays.fill(cnt, 1);
		for(int i=0;i<n;i++) {
			cnt[l.get(i)]++;
		}
		cnt[l.get(0)]--;
		cnt[l.get(n-1)]--;
		for(int i=0;i<n;i++) {
			c=Math.min(c, cnt[l.get(i)]);
		}
		System.out.println(c);
		
	}
	public static void main(String[] args) throws Exception {
		s = new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc = 1;
		tc	=s.nextInt();
		for (int test = 1; test <= tc; test++) {
				main();
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