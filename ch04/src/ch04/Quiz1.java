package ch04;

import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cumputerIn = (int)(Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 9까지 숫자를 입력해 주세요. : ");
		int peopleIn = sc.nextInt();
		
		System.out.println("컴퓨터의 숫자는 : " + cumputerIn);
		System.out.println("입력하신 숫자는 : " + peopleIn);
		
		if (cumputerIn == peopleIn) {
			System.out.println("맞췄다.");
		}
		else {
			System.out.println("꽝 다음기회를.");
		}
	}

}
