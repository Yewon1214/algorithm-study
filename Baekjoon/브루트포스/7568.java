package test;

import java.io.*;
import java.util.*;

public class baekjuntest {
	
	public static void main(String []args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []weight = new int[n];
		int []height = new int[n];
		int []rank = new int[n];
		
		StringTokenizer st = null;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			int w=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			
			weight[i]=w;
			height[i]=h;
		}
		
		for(int i=0; i<n; i++) {
			int cnt=1;
			
			for(int j=0; j<n; j++) {
				if(i==j) continue;
				if(weight[i]<weight[j]) { //�ڱ⺸�� �����԰� ���� ������.
					if(height[i]<height[j]) { //�ڱ⺸�� Ű�� ũ��.
						cnt++;
					}
				}
			}
			rank[i]=cnt;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(rank[i]+" ");
		}
		
	}
}

