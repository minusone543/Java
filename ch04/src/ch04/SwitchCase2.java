package ch04;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� ������ ����� �Է����ּ��� : ");
		String medal = sc.next();
		
		switch (medal) {
		case "Gold":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		
		case "Silver":
			System.out.println("���޴� �Դϴ�.");
		
		case "Bronze":
			System.out.println("���޴� �Դϴ�.");
			
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		}
	}

}
