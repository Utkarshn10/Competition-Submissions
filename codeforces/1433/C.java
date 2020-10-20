
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
				int max=0,p=0,cn=0,c1=1,c2=0,c3=0;
				for(int i=0;i<n;i++) {
					ar[i]=s.nextInt();
					if(max<ar[i]) {
						max=ar[i];
						
					}
					
				}

					 p=-1;
					for(int i=0;i<n;i++) {
						if(i>0 &&ar[i]==max && max>ar[i-1]) {
							p=i+1;
							break;
						}
						if(i<n-1 &&ar[i]==max && max>ar[i+1]) {
							p=i+1;
							break;
						}
					}
					System.out.println(p);
				
		}
		

		
	}	

	}


