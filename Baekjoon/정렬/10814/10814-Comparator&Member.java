import java.util.*;
import java.io.*;

class Member{
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
		
		Comparator<Member> comparator = new Comparator<>() {
			public int compare(Member o1, Member o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}else if(o1.getAge() == o2.getAge()) {
					return 0;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(list, comparator);
		for(Member m : list) {
			System.out.println(m.getAge()+" "+m.GetName());
		}
	}

}