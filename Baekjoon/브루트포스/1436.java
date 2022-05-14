package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjuntest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int number=0;
		int cnt=0;
		while(cnt!=n) {
			
			number++;
			String str = Integer.toString(number);
			if(str.contains("666")) {
				cnt++;
			}
			
		}
		System.out.print(number);
	}

}

