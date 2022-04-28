import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = Integer.parseInt(sc.nextLine());
        
        StringBuilder []sb = new StringBuilder[201]; //최대 나이만큼
        
        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }
        
        for(int i=0; i<T; i++){
            int age = sc.nextInt(); String name = sc.next();
            
            sb[age].append(age+" "+name+"\n");
        }
        
        StringBuilder p = new StringBuilder();
        for(StringBuilder s : sb){
            p.append(s);
        }
        
        System.out.print(p);
    }
}