import java.io.*;
import java.util.*;

class Point{
    int x;
    int y;
        
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
}

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        Point[] arr = new Point[n];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
            arr[i] = new Point(x,y);
        }
        
        //¶÷´Ù½Ä
        Arrays.sort(arr, (Point p1, Point p2) -> {
            if(p1.y==p2.y){
                return p1.x-p2.x;
            }else{
                return p1.y-p2.y;
            }
        });

        
        for(int i=0; i<n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}