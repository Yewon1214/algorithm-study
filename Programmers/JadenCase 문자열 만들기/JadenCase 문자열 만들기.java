import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(i == 0 && !('0'<= c && c<='9')){  //ù��°�� ���ڰ� �ƴ� ���
                if(65<=c && c<=90){//�빮�ڶ�� 
                    answer+=c;
                }else if(97<=c && c<=122){//�ҹ��ڶ��
                    answer+=(char)(c-32);
                }
            }
            else if(i!=0 && s.charAt(i-1) == ' '){ //�� �ε����� ��ĭ�ϰ��
                if(65<=c && c<=90 || c==' '){//�빮�ڶ�� 
                    answer+=c;
                }else if(97<=c && c<=122){//�ҹ��ڶ��
                    answer+=(char)(c-32);
                }
            }
            else{
                if(65<=c && c<=90){//�빮�ڶ�� 
                    answer+=(char)(c+32);
                }else{ //�ҹ���
                    answer+=c;
                }
            }
        }
        
        return answer;
    }
}