package test;

import java.util.*;
import java.io.*;

public class btest {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		for(int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		
		//bufferedWriter가 더 오래걸림.
//		for(int i: list) {
//			bw.write(i+"\n");
//		}
//		bw.flush();
	}

}
