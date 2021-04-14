package day05;

import java.util.Scanner;

public class Class1_IfEx {

	public static void main(String[] args) {
		/*
		 * 합격 불합격 출력 프로그램
		 * 1. 입력값 : 학년, 점수
		 * 2. 출력 조건
		 *    - 1~3학년은 점수가 60점 이상이어야 합격
		 *    - 4학년은 70점 이상이어야 합격
		 */
		
         Scanner scan = new Scanner(System.in);
         int year=0, score=0;
         System.out.print("학년을 입력하세요 : ");
         year = scan.nextInt();
         System.out.print("점수를 입력하세요 : ");
         score = scan.nextInt();
         
         if(score>=60) {
        	  if(year != 4) {
        		  System.out.println("합격");
        	  } else if(score>=70) {
        		  System.out.println("합격");
        	  } else {
        		  System.out.println("불합격");
        	  }
         } else {
        	 System.out.println("불합격");
         }
         
         
         scan.close();
		
		
		
		

	}

}
