package ch04;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- if 문을 여러개 사용했을 경우 -----");
		
		int age = 0;
		int charge;
		
		age = 9;
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "원입니다.");
		
		
		System.out.println("----- else if 문을 사용했을 경우 -----");
		
		age = 0;
		age = 9;
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는" + charge + "원입니다.");
	}

}
