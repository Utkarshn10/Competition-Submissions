
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;



public class A {
	static int mx= 1000005 ;
 

	static void solve() throws Exception{
		MScanner sc = new MScanner(System.in);
		int n=s.nextInt();
	
		int[] a= new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		
		}
//		if(n%2==0) {
			for(int i=n-1;i>0;i-=2) {
				System.out.print(a[i]+" "+a[i-1]+" ");
			}
		
			if(n%2!=0)System.out.println(a[0]);
			System.out.println();
 
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


//
//int m=s.nextInt();
//int[][] a = new int[n][m];
//for(int i=0;i<n;i++) {
//	for(int j=0;j<m;j++)a[i][j]=s.nextInt();
//}
//long sum=0;
//for(int i=0;i<n;i++) {
//	for(int j=0;j<m;j++) {
//		int sum1=Math.abs(a[i][j]-a[i][m-j-1]);
//		if(j<(m+1)/2)System.out.println(a[i][j]+"= "+ sum1);
////		int sum2=0;
////		sum2=Math.abs(a[i][j]-a[n-i-1][j]);
////		System.out.println(a[i][j]+"= "+ sum2);
//		
//		sum+=sum1;
//	}
//}
//System.out.println(sum);