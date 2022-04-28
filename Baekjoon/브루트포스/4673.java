public class Main {

	public static int selfNum(int n) { 
		int sum = n;
		while(n!=0) { 
			sum=sum+(n%10);
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		boolean []b = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int n = selfNum(i); //�����ڰ� �ִ� �� ����.
			if(n<10001) {
				b[n]=true; //�����ڰ� ������ true�� �ٲ��ֱ�
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(b[i]!=true) {
				System.out.println(i);
			}
		}
	}

}