class Solution {
    public int[] solution(int[] prices) {
        int var = prices.length;
        int[] answer = new int[var];
        
        for(int i=0; i<var; i++){
            int index=0;
            for(int j=i+1; j<var; j++){
                if(prices[j]>=prices[i]){
                    index++;
                }else{
                    index++;
                    break;
                }
                
            }
            answer[i]=index;
        }
        return answer;
    }
}