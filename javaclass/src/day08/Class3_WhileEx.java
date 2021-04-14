package day08;

import java.util.Scanner;

public class Class3_WhileEx {

	public static void main(String[] args) {
		// 임의의 정수를 여러 개 입력한 뒤 마지막에 0을 입력하면
		// 입력된 정수의 갯수와 평균값을 출력하는 프로그램
		// 숫자를 하나 입력하고 엔터
		// - 반복문이 한번 실행된다는 것
		// - 입력된 숫자 더해야함
		// - 횟수도 올려야함
		// - 0이 입력되면 반복문 종료 후 계산결과와 횟수 출력
		
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, count = 0;
		// 숫자입력     합계      갯수
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요 :");
		
		boolean run = true;
	    while(run) {
	    	num = scan.nextInt();
	    	sum += num;
	    	if(num==0) {
	    		run = false;
	    	} else {
	    		count++;
	    	}
	    }
		System.out.println("입력한 수는 "+count+"개");
	    System.out.println("평균은 "+sum/count);
	    
	    
	    
	    scan.close();

	}

}
