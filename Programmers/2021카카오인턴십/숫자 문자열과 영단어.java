(1)-ȿ�������� ��ģ��
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer =0;
        
        String engarr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String numarr[] ={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<10; i++){
            s=s.replaceAll(engarr[i], numarr[i]);
        }
        
        return Integer.parseInt(s);
    }
}

(2)-���� ���� Ǭ ��
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String result = "";
        HashMap<String, Integer> maps = new HashMap<>();

        maps.put("zero",0);
        maps.put("one",1);
        maps.put("two",2);
        maps.put("three",3);
        maps.put("four",4);
        maps.put("five",5);
        maps.put("six",6);
        maps.put("seven",7);
        maps.put("eight",8);
        maps.put("nine",9);

        String tmp = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c<='z'){ //ù ���ڰ� �����
                tmp+=c;

                if(maps.containsKey(tmp)){
                    result+=String.valueOf(maps.get(tmp));
                    tmp="";
                }
            }else{
                result+=c;
            }
        }
        answer = Integer.parseInt(result);
        return answer;
    }
}