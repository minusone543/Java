package ch04;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- if ���� ������ ������� ��� -----");
		
		int age = 0;
		int charge;
		
		age = 9;
		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("��, �����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		System.out.println("������" + charge + "���Դϴ�.");
		
		
		System.out.println("----- else if ���� ������� ��� -----");
		
		age = 0;
		age = 9;
		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age < 20) {
			charge = 2500;
			System.out.println("��, �����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		System.out.println("������" + charge + "���Դϴ�.");
	}

}