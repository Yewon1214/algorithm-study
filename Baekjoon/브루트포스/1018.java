package test;

import java.io.*;
import java.util.StringTokenizer;

public class baekjuntest {

	static char [][]arr;
	
	static int min=64;
	
	public static void check(int m, int n) {
		int cnt=0;
		int end_m=m+8;
		int end_n=n+8;
		
		char c = arr[m][n];
		for(int i=m; i<end_m; i++) {

			for(int j=n; j<end_n; j++) {
				if(arr[i][j] != c) {
					cnt++;
				}
				
				if(c=='W') {
					c='B';
				}else {
					c='W';
				}
			}
			
			if(c=='W') {
				c='B';
			}else {
				c='W';
			}
		}
		
		
		cnt=Math.min(cnt, 64-cnt);
		
		min=Math.min(min, cnt);

	}
	
	public static void main(String []args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		arr = new char[m][n];


		for(int i=0; i<m; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j]=str.charAt(j);
			}
		}


		int N = n-7; 
		int M = m-7;
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				check(i,j);
			}
		}

		System.out.println(min);
	}

}

