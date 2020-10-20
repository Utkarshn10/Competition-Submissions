
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int t = s.nextInt();
			while(t-->0) {
				int n = s.nextInt();
				int[] ar = new int[n];
				int[] p = new int[n];
				int k=0;
				for(int i=0;i<n;i++) {
					ar[i]=s.nextInt();
					if(ar[i]==1) {
						p[k++]=i;
//						System.out.print(i+" ");
					}
				}
//				System.out.println(k);
				
				int c=0;
				for(int i=1;i<k;i++) {
					
					c+=(p[i]-p[i-1]-1);
				}
				System.out.println(c);
			}
			
		}
		

		
			

	}


