import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<String> str = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
        	String tmp = br.readLine();
        	if(!str.contains(tmp)) {
        		str.add(tmp);
        	}
            
        }
        
        //¶÷´Ù½Ä
        Collections.sort(str, new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		if(s1.length() == s2.length()) {
        			return s1.compareTo(s2);
        		}else {
        			return s1.length()-s2.length();
        		}
        	}
        });

        
        for(int i=0; i<str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
 
}