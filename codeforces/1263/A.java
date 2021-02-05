
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;



public class B {
	static int mx= 1000005;
	static MScanner in = new MScanner(System.in);
	
	static void solve() throws Exception{
		MScanner sc = new MScanner(System.in);
		
		int[]a=new int[3];
		a[0]=s.nextInt();
		a[1]=s.nextInt();
		a[2]=s.nextInt();
		Arrays.sort(a);
		if(a[2]<=a[0]+a[1])System.out.println((a[0]+a[1]+a[2])/2);else System.out.println(a[0]+a[1]);
	}
	
	static Integer[] sort(Integer[] arr,int n) {
		Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1)
            {
                 // TODO Auto-generated method stub
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
        return arr;
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
	public static Integer[] inputI(int n) throws IOException{
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		return a;
	}
	public static int[][] imat(int n,int m) throws IOException{
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
		return a;
	}
	static int kadane(int A[])
	{
		int lsum=A[0],gsum=A[0];
		for(int i=1; i<A.length; i++)
		{
			lsum=Math.max(lsum+A[i],A[i]);
			gsum=Math.max(gsum,lsum);
		}
		return gsum;
	}
	static void print(int A[])
	{
		for(int i:A)System.out.print(i+" ");
		System.out.println();   
	}
 
	static void print(Integer A[])
	{
		for(int i:A)System.out.print(i+" ");
		System.out.println();   
	}
	static void print(long A[])
	{
		for(long i:A)System.out.print(i+ " ");
		System.out.println();
 
	}
	static void print(boolean A[])
	{
		for(boolean i:A)System.out.print(i+ " ");
		System.out.println();
 
	}
//	static void sort(long[] a) 
//	{
//		ArrayList<Long> l=new ArrayList<>();
//		for (long i:a) l.add(i);
//		Collections.sort(l);
//		for (int i=0; i<a.length; i++) a[i]=l.get(i);
//	}
// 
	static String swap(String X,int i,int j)
	{
		char ch[]=X.toCharArray();
		char a=ch[i];
		ch[i]=ch[j];
		ch[j]=a;
		return new String(ch);
	}
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	static boolean isPrime(long N)
	{
		if (N<=1)  return false; 
		if (N<=3)  return true; 
		if (N%2 == 0 || N%3 == 0) return false; 
		for (int i=5; i*i<=N; i=i+6) 
			if (N%i == 0 || N%(i+2) == 0) 
				return false; 
		return true; 
	}
	static int i() throws IOException
	{
		return in.nextInt();
	}
 
	static long l() throws IOException
	{
		return in.nextLong();
	}
	static int[] input(int N) throws IOException{
		int A[]=new int[N];
		for(int i=0; i<N; i++)
		{
			A[i]=in.nextInt();
		}
		return A;
	}
 
	static long[] inputLong(int N) throws IOException     {
		long A[]=new long[N];
		for(int i=0; i<A.length; i++)A[i]=in.nextLong();
		return A;
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

