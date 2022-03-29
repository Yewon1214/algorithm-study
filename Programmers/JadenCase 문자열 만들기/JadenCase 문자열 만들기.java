import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(i == 0 && !('0'<= c && c<='9')){  //첫번째가 숫자가 아닐 경우
                if(65<=c && c<=90){//대문자라면 
                    answer+=c;
                }else if(97<=c && c<=122){//소문자라면
                    answer+=(char)(c-32);
                }
            }
            else if(i!=0 && s.charAt(i-1) == ' '){ //전 인덱스가 빈칸일경우
                if(65<=c && c<=90 || c==' '){//대문자라면 
                    answer+=c;
                }else if(97<=c && c<=122){//소문자라면
                    answer+=(char)(c-32);
                }
            }
            else{
                if(65<=c && c<=90){//대문자라면 
                    answer+=(char)(c+32);
                }else{ //소문자
                    answer+=c;
                }
            }
        }
        
        return answer;
    }
}