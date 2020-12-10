package ch02;

public class OperationEx2 {
	public void operationEx2() {
		System.out.println("----- operationEx2 -----");
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
	}
}
