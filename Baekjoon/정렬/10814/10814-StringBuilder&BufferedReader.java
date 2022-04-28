import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder[] sb = new StringBuilder[201];
        for(int i=0; i<sb.length; i++){
            sb[i]=new StringBuilder();
        }
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            sb[age].append(age+" "+name+"\n");
        }
        
        StringBuilder p = new StringBuilder();
        for(StringBuilder s: sb){
            p.append(s);
        }
        
        System.out.println(p);
    }
}