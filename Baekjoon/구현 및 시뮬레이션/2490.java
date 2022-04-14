import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        //A-도 B-개 C-걸 D-윷 E-모 1111 1-등 배-0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] c = new int[3][4];
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				c[i][j]= Integer.parseInt(st.nextToken());
			}
		}

		int front=0;
		for(int i=0; i<3; i++) {
			front=0; 
			for(int j=0; j<4; j++) {
				if(c[i][j]==0) { //배
					front++;
				}
			}
			if(front==1) { //도
				System.out.println("A");
			}else if(front==2) { //개
				System.out.println("B");
			}else if(front==3) { //걸
				System.out.println("C");
			}else if(front==4) { //윷
				System.out.println("D");
			}else { //모
				System.out.println("E");
			}
		}
    }
}