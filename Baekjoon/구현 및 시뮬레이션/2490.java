import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        //A-�� B-�� C-�� D-�� E-�� 1111 1-�� ��-0
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
				if(c[i][j]==0) { //��
					front++;
				}
			}
			if(front==1) { //��
				System.out.println("A");
			}else if(front==2) { //��
				System.out.println("B");
			}else if(front==3) { //��
				System.out.println("C");
			}else if(front==4) { //��
				System.out.println("D");
			}else { //��
				System.out.println("E");
			}
		}
    }
}