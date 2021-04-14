package day09;

import java.util.Scanner;

public class Class3_ArrayMax {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열 선언
		// 스캐너로 값을 입력받아 입력된 값 중에서 가장 큰 값 출력하기
		// {1,3,5,4,2} -> max값 선언해서 하나씩 대입하며 비교
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		int max = 0;
		
		for(int i=0; i<num.length; i++) {
			System.out.print("숫자입력 : ");
			num[i] = scan.nextInt();
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
		
		
		
		scan.close();
		

	}

}
