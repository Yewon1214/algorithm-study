import java.util.*;
import java.io.*;

class Member implements Comparable<Member>{
	private int age;
	private String name;
	
	public Member() {
		
	}
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String GetName() {
		return name;
	}
	
	public int compareTo(Member o) {
		if(this.age > o.age) {
			return 1;
		}else if(this.age == o.age) {
			return 0;
		}else {
			return -1;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		ArrayList<Member> list = new ArrayList<Member>();
		
		for(int i=0; i<T; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			
			list.add(new Member(age, name));
		}
		
		Collections.sort(list);
		
		for(Member m : list) {
			System.out.println(m.getAge()+" "+m.GetName());
		}
	}

}