class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int index = -1;
        
        for(int i=0; i<number.length()-k; i++){
            char max = '0';
            for(int j=index+1; j<=k+i; j++){
                char c = number.charAt(j);
                if(c > max){ 
                    max = c;
                    index = j;
                }
                if(c == '9'){
                    break;
                }
            }
            answer+=max;
        }

        return answer;
    }
}