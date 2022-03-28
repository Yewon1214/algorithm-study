import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        //String num[] = {"4","1","2"};
        String a = "";
        while(n>0){
            // a+=num[n%3];
            // n=(n-1)/3;
            if(n%3==1){
                a+=1;
            }else if(n%3==2){
                a+=2;
            }else if(n%3==0){
                a+=4;
                n--;
            }
            n=n/3;
        }
        
        StringBuffer sb = new StringBuffer(a);
        answer = sb.reverse().toString();
        
        return answer;
    }
}