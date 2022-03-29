class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1=0, num2=1;
        //int sum[] = new int[n+1];
        
        //sum[0]=0;
        //sum[1]=1;
        
        for(int i=2; i<=n; i++){
            //sum[i] = (sum[i-1] + sum[i-2])%1234567;
            answer=(num1+num2)%1234567;
            num1=num2;
            num2=answer;
        }
        
        return answer;
    }
    
}