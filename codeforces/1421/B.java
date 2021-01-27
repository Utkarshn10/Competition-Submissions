
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;



public class A {
	static int mx= 1000005 ;


	static void solve() throws Exception{
		MScanner sc = new MScanner(System.in);
		int n = s.nextInt();
		Character[][] ar = new Character[n][n];
		for(int i=0;i<n;i++) {
			String se=s.next();
			for(int j=0;j<n;j++) {
				ar[i][j]=se.charAt(j);
			}
		}
		
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		char a = ar[0][1],b=ar[1][0],c=ar[n-1][n-2],d=ar[n-2][n-1];
		if(a==b) {
//			c==d & c!=a
			if(c==a) {
				x.add(n);
				y.add(n-1);
			}
		
			if(a==d) {
				x.add(n-1);
				y.add(n);
			}
				
		
		}
		else if(c==d) {
//			a==b & a!=c
			if(c==a) {
				x.add(1);
				y.add(2);
			}
			if(c==b) {
				x.add(2);
				y.add(1);
			}
		}
		else {
//			a==b & c==d && a!=c
			x.add(2);
			y.add(1);
			if(a==c) {
				x.add(n);
				y.add(n-1);
//				x.add(n);
//				y.add(n-1);
			}
			 if(a==d) {
				x.add(n-1);
				y.add(n);
			}
		
			
		}
		System.out.println(x.size());
		for(int i=0;i<x.size();i++) {
			System.out.println(x.get(i)+" "+y.get(i));
		}

		
	}	
		

	static void preComp_Prime() throws Exception{//To precompute prime numbers
		int[] a = new int[mx];
		int[] ans = new int[mx];
		Arrays.fill(a, 1);
		a[0]=0;
		a[1]=0;
		for(int i=2;i*i<=1000000;i++) {
			for(int j=i*i;j<=1000000;j+=i) {
				a[j]=0;
			}
		}//precomp done
		for(int i=2;i<=1000000;i++) {//Checking if the sum of 2 primes is a prime or not
			if(a[i]==1 && a[i-2]==1)ans[i]=1;
			ans[i]+=ans[i-1];
		}
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