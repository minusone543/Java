package ch03;

public class Q1 {
	public void q1() {
		System.out.println("-----1�� ����-----");
		int myAge = 23;
		System.out.println("���� = ");
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		System.out.println("���� == ");
		
		char ch;
		ch = (myAge>teacherAge) ? 'T' : 'F';
		System.out.println("���� ? , :");
		
		System.out.println(ch);
	}
}
