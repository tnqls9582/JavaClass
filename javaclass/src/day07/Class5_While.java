package day07;

public class Class5_While {

	public static void main(String[] args) {
		/*
		 * while문 (반복문)
		 * 
		 * while(반복조건) {
		 *    반복실행내용
		 * }
		 */
		
		int i=1;
		while(i<=10) { // 1
			System.out.println(i); // 2
			i++; // 3
		}
		System.out.println("while문 끝");
		System.out.println(i); // while문 끝나도 i값 가짐
		
		
		// 무한반복
		boolean run = true;
		while(run) {
			System.out.println("무한반복 됩니다.");
			i++;
			if(i==100) {
				System.out.println("무한반복 종료");
				run = false;
			}
		}
		
		
		
		/*
		 * do while문
		 * 
		 * do {
		 *   반복실행내용
		 * } while(반복조건);
		 */
		// while문은 반복조건이 맞지 않으면 반복문 실행을 전혀 하지 않음
		// do while문은 조건이 맞던 맞지 않던 한번은 실행하고 반복조건을 따짐
		
	    int j = 10;
	    do {
	    	System.out.println("반복문 내부");
	    } while(j<=5); // 조건이 맞지 않지만 "반복문 내부" 출력
		
		
		
		
		

	}

}
