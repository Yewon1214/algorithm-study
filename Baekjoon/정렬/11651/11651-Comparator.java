import java.io.*;
import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;
        
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
 
    public int compareTo(Point p) {
    	if(this.y==p.y) {
    		return this.x-p.x;
    	}else {
    		return this.y-p.y;
    	}
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
        Arrays.sort(arr);

        
        for(int i=0; i<n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}