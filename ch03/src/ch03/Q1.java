package ch03;

public class Q1 {
	public void q1() {
		System.out.println("-----1번 문제-----");
		int myAge = 23;
		System.out.println("정답 = ");
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		System.out.println("정답 == ");
		
		char ch;
		ch = (myAge>teacherAge) ? 'T' : 'F';
		System.out.println("정답 ? , :");
		
		System.out.println(ch);
	}
}
