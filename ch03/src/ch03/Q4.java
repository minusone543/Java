package ch03;

public class Q4 {
	public void q4() {
		System.out.println("----- 4번 문제 -----");
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result + " : 정답 False");
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result + " : 정답 True");
		System.out.println(!result + " : 정답 False");
		
	}
}
