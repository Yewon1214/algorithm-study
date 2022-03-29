import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int[] C = new int[B.length];

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<B.length; i++){
            C[i]=B[B.length-1-i];
        }
        
        for(int i=0; i<A.length; i++){
            answer = answer + (A[i]*C[i]);
        }

        return answer;
    }
}