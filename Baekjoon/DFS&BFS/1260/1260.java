import java.util.*;
import java.io.*;

public class Main {
	
	public static boolean[] visited = new boolean[1001];
	public static int[][] graph = new int [1001][1001];
	public static int n;
	public static int m;
	public static int v;
	
	public static void dfs(int x) {
		visited[x]=true;
		System.out.print(x+" ");
		
		for(int i=1; i<=n; i++) {
			if(graph[x][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	public static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(v);
		visited[v]=true;
		
		while(!q.isEmpty()) {
			int x=q.poll();
			System.out.print(x+" ");
			for(int i=1; i<=n; i++) {
				if(graph[x][i] ==1 && visited[i] == false) {
					q.offer(i);
					visited[i]=true;
				}
			}
		}
	}

	public static void main(String[] args)  throws IOException{
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		m =sc.nextInt();
		v =sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph[x][y] = graph[y][x] =1;
		}
		
		dfs(v);
		System.out.println();
		
		visited = new boolean[1001];
		bfs();
	}
}
