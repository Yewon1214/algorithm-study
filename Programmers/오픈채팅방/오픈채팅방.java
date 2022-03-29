import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        List<String> cmd = new ArrayList<>();
        HashMap<String, String> users = new HashMap<>();
        
        for(String input: record){
            String []str = input.split(" ");
            
            if(str[0].equals("Change")){
                users.put(str[1], str[2]);
            }else if(str[0].equals("Enter")){
                cmd.add(str[0]);
                users.put(str[1], str[2]);
            }else{
                cmd.add(str[0]);
                users.put(str[1], users.get(str[1]));
            }
        }
        
        
        String[] answer = new String[cmd.size()];
        int j=0;
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Change")){
                continue;
            }else if(str[0].equals("Enter")){
                answer[j]=users.get(str[1])+"���� ���Խ��ϴ�.";
            }else if(str[0].equals("Leave")){
                answer[j]=users.get(str[1])+"���� �������ϴ�.";
            }
            if(j++>=cmd.size()){
                break;
            }
        }
        return answer;
    }
}