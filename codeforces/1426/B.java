			
			
			import java.io.BufferedReader; 
			import java.io.IOException; 
			import java.io.InputStreamReader;
			import java.math.BigInteger;
			import java.util.*;
			
				
			
			
			public  class FibinacciSeries 
			{
			
				   
				   static class FastReader 
				    { 
				        BufferedReader br; 
				        StringTokenizer st; 
				       
				  
				        public FastReader() 
				        { 
				            br = new BufferedReader(new
				                     InputStreamReader(System.in)); 
				        } 
				  
				        String next() 
				        { 
				            while (st == null || !st.hasMoreTokens()) 
				            { 
				                try
				                { 
				                    st = new StringTokenizer(br.readLine()); 
				                } 
				                catch (IOException  e) 
				                { 
				                    e.printStackTrace(); 
				                } 
				            } 
				            return st.nextToken();
				            
				        } 
				  
				        int nextInt() 
				        { 
				            return Integer.parseInt(next()); 
				        } 
				  
				        long nextLong() 
				        { 
				            return Long.parseLong(next()); 
				        } 
				  
				        double nextDouble() 
				        { 
				            return Double.parseDouble(next()); 
				        } 
				  
				        String nextLine() 
				        { 
				            String str = ""; 
				            try
				            { 
				                str = br.readLine(); 
				            } 
				            catch (IOException e) 
				            { 
				                e.printStackTrace(); 
				            } 
				            return str; 
				        }
			
						public Character charAt(int i) {
							// TODO Auto-generated method stub
							return null;
						}
			
						public BigInteger nextBigInteger() {
							// TODO Auto-generated method stub
							return null;
						} 
				    } 
				   int lowerBound(int[] a,int n,int key){
				        int s =0,e=n-1;
				        int ans = -1;
			
				        while(s<=e){
				            int mid = (s+e)/2;
			
				            if(a[mid]==key){
				                ans = mid;
				                e = mid - 1;
				            }
				            else if(a[mid]>key){
				                e = mid - 1;
				            }
				            else{
				                s = mid + 1;
				            }
				        }
			
				        return ans;
				    }
			
			    public static void main(String[] args) throws IOException {
			    	FastReader s=new FastReader();
			    	int t = s.nextInt();
			    	while(t-->0) {
			    		int n =s.nextInt();
			    		int m = s.nextInt();
			    		int flag=0;
			    		int c1=0;
			    		if(m%2!=0) {
			    			while(n-->0) {
			    				int a = s.nextInt();
				    			int b = s.nextInt();
				    			int c= s.nextInt();
				    			int d = s.nextInt();
			    			}
			    			System.out.println("NO");
			    		}
			    		else {
			    			c1=0;
			    			while(c1++<n) {
			    				int a = s.nextInt();
				    			int b = s.nextInt();
				    			int c= s.nextInt();
				    			int d = s.nextInt();
//				    			System.out.println(a+" "+b+" "+c+" "+d);
				    			if(b==c) {
			    					flag=1;
			    					
				    			}
				    			
				    		}
			    			if(flag==0)System.out.println("NO");
			    			else System.out.println("YES");
			    		}
			    		
			    	}
			    	
			    	
			    }
			    
			    	
			   
			    }
		
			
			
			
			
			
			
			
			
			        
			    
			
			      
			 