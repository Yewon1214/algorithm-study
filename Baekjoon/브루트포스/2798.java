import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[] arr = new int[n];
		int sum =0;
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++ ) {
					sum=arr[i]+arr[j]+arr[k];
					if(max<sum && sum<=m) {
						max=sum;
					}
				}
			}
		}
		System.out.println(max);
	}

}