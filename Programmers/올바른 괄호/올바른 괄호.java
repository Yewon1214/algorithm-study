class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char left[] = new char[s.length()/2];
        char right[] = new char[s.length()/2];
        int index1=0, index2=0;
        
        try{
            if(s.charAt(0) == '(' && s.charAt(s.length()-1) == ')' && s.length()%2 == 0){
                for(int i=0; i<s.length(); i++){
                    char c = s.charAt(i);
                    if(c == '('){
                        left[index1++]='(';
                    }else if(c == ')'){
                        right[index2++]=')';
                    }
                    if(index1<index2){ return false; }
                }
                
            }else{ return false; }
            
        }catch(ArrayIndexOutOfBoundsException e){
            return false;
        }

    
        return answer;
    }
}