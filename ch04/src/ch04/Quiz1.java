package ch04;

import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cumputerIn = (int)(Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 9���� ���ڸ� �Է��� �ּ���. : ");
		int peopleIn = sc.nextInt();
		
		System.out.println("��ǻ���� ���ڴ� : " + cumputerIn);
		System.out.println("�Է��Ͻ� ���ڴ� : " + peopleIn);
		
		if (cumputerIn == peopleIn) {
			System.out.println("�����.");
		}
		else {
			System.out.println("�� ������ȸ��.");
		}
	}

}