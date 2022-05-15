package test;


import java.io.*;
import java.util.Arrays;

public class btest {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double avg=0;
		int mean =0;
		int freq =0;
		int range=0;
		
		int n=Integer.parseInt(br.readLine());
		
		int []arr = new int[n];
		int []cnt = new int[8001];
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			int num=Integer.parseInt(br.readLine());
			avg+=num;
			arr[i]=num;

			max= Math.max(max, num);
			min=Math.min(min, num);
			cnt[num+4000]++;
		}
		
		//최빈값 구하는 건 검색했음.
		
		int mode_max=0;
		boolean flag = false;
		for(int i=min+4000; i<=max+4000; i++) {
			if(cnt[i]>0) {
				
				if(mode_max<cnt[i]) {
					mode_max=cnt[i];
					freq=i-4000;
					flag=true;
				}else if(mode_max == cnt[i] && flag==true) {
					freq = i-4000;
					flag=false;
				}
			}
		}
		
		Arrays.sort(arr);
		mean = arr[n/2];
		range = max-min;
		avg=Math.round(avg/n);

		System.out.println((int)avg);
		System.out.println(mean);
		System.out.println(freq);
		System.out.println(range);
		
	}

}
