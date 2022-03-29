import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = clothes.length;
        HashMap<String, Integer> a = new HashMap<>();
        int count = 0, sum;
        
        for(int i=0; i<clothes.length; i++){
            if(a.containsKey(clothes[i][1])){ //해쉬맵에 똑같은 의상종류가 있으면
                count = a.get(clothes[i][1]);
                a.replace(clothes[i][1], ++count);    
            }else{ //없으면
                a.put(clothes[i][1], 1);
            }
        }

        if(a.size()>=2){
            sum=1;
            for(Integer c: a.values()){
                sum *= c+1;
                System.out.print(c);
            }
            answer = sum-1;
        }
        return answer;
    }
}