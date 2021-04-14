package day09;

import java.util.Scanner;

public class Class2_ArrayEx {

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열을 선언
		// 스캐너를 이용해 배열에 값을 저장
		// 입력된 값의 총합, 평균을 계산하시오
		
	    Scanner scan = new Scanner(System.in);
	    int[] num = new int[3];
	    int sum = 0;
	    
//	    System.out.print("1 : ");
//	    num[0] = scan.nextInt();
//	    System.out.print("2 : ");
//	    num[1] = scan.nextInt();
//	    System.out.print("3 : ");
//	    num[2] = scan.nextInt();    -> 반복문으로 사용하면 편리
	    
	    
	    for(int i=0; i<num.length; i++) {
	    	System.out.print((i+1)+"번째 숫자입력 : ");
	    	num[i] = scan.nextInt();
	    	sum += num[i];
	    }
	    System.out.println(sum);
	    System.out.println(sum/num.length);
		
		
		scan.close();
		

	}

}
