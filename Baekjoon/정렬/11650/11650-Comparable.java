import java.io.*;
import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;
        
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int compareTo(Point arg0) {
        if(this.x == arg0.x) {
            return this.y - arg0.y;
        } else {
            return this.x - arg0.x;
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
        
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
 
}