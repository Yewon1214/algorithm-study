import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        
        int []arr= new int[n];
        int []tmp= new int[n];
        HashMap<Integer, Integer> maps = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++) {
        	int num=Integer.parseInt(st.nextToken());
            arr[i]=num;
            tmp[i]=num;
        }
        
        Arrays.sort(tmp);
        
        int rank=0;
        for(int i: tmp) {
        	if(!maps.containsKey(i)) {
        		maps.put(i, rank);
        		rank++;
        	}
        }
        
        for(int k: arr) {
        	int ranking = maps.get(k);
        	sb.append(ranking+" ");
        }
        
        System.out.print(sb);
        
    }
}