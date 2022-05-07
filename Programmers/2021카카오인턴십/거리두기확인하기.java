import java.util.*;
class Solution {
     public static boolean bfs(int x, int y, String[] p){
         int[] dx = {-1, 1, 0, 0};
         int[] dy = {0, 0, -1, 1};
         
         Queue<int[]> queue = new LinkedList<int[]>();
         queue.offer(new int[]{x, y});
         
         while(!queue.isEmpty()){
             int[] position = queue.poll();
             
             for(int i=0;i<4;i++){
                 int nx=position[0]+dx[i];
                 int ny=position[1]+dy[i];
                 
                 if(nx <0 || ny<0 || nx>=5 || ny >=5 ||(nx==x && ny==y)){
                     continue;
                 }
                 
                 int d = Math.abs(nx-x)+Math.abs(ny-y);
                 
                 if(p[nx].charAt(ny)=='P' && d<=2){
                     return false;
                 }else if(p[nx].charAt(ny)=='O' && d<2){
                     queue.offer(new int[] {nx, ny});
                     
                 }
             }
             
         }
         
         return true;
     }
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for(int i=0; i<places.length; i++){
            String []p = places[i];
            boolean isOk=true;
            for(int j=0; j<5 && isOk; j++){
                for(int k=0; k<5; k++){
                    //���� P�� �� ��濡 P�� �ֳ� �˻��ϴµ� ��濡 O�� �����ϸ� �ѹ� �� ���� P�� �ִ��� �˻�
                    char c = p[j].charAt(k);
                    if(c=='P'){
                        if(!bfs(j, k, p))
                        	isOk=false;
                    }
                }
                    
            }
            //P�� �� �� �˻�������
            answer[i] = isOk ? 1 : 0;
        }
        
        return answer;
    }
}