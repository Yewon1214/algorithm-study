class Solution {
    public static long gcd(long w, long h){
        long result=0;
        for(int i=1; i<=w; i++){
            if(w%i==0 && h%i==0){
                result=i;
            }
        }
        return result;
    }
    public long solution(long w, long h) {
        long answer = 1;
        long igcd=0; //�ִ����� ���ϴ� ����
        if(w>h){ 
            igcd=gcd(w,h);
            answer = w*h-(w+h-igcd);
        }else if(w<h){
            igcd=gcd(h,w);
            answer = w*h-(w+h-igcd);
        }else{ //���� ���� ���
            answer = (w * h) - w;
        }
        return answer;
    }
}