package day10;

import java.util.Scanner;

public class Class3_ArrayEx {

	public static void main(String[] args) {
		// for문 사용
		// 숫자 입력은 한번만
		
		Scanner scan = new Scanner(System.in);
		int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
		int number = 0;
		System.out.print("숫자 입력 : ");
		number = scan.nextInt();
		
		for(int i=0; i<num.length; i++) {
	        if(number == num[i]) {
	        	System.out.println(number+"는 "+i+"번 인덱스에 있습니다.");
	        }
	    }
		
		
		
		scan.close();
		
		
		

	}

}
