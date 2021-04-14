package day10;

import java.util.Scanner;

public class Class6_ExAll {

	public static void main(String[] args) {
		// 1. 학생수 - 학생 수 입력
		// 2. 점수입력 - 학생 수 만큼 점수 입력
		// 3. 점수리스트 - 점수 출력
		// 4. 분석 - 점수의 최고값,평균값,내림차순 정렬
		// 5. 종료
		
		Scanner scan = new Scanner(System.in);
		
		int select = 0;
		int student = 0;
		int[] score = null;
		int transfer = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if(select == 1) {
				System.out.print("학생수> ");
				student = scan.nextInt();
				score = new int[student];
			} else if(select == 2) {
				for(int i=0; i<score.length; i++) {
					System.out.print((i+1)+"번째 학생점수 : ");
					score[i] = scan.nextInt();
				}
			} else if(select ==3) {
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1)+"번째 학생점수 : "+score[i]);
				}
			} else if(select ==4) {
				int max = 0, sum = 0;
				double avg = 0.0;
				for(int i=0; i<score.length; i++) {
					if(max<score[i]) {
						max = score[i];
					}
					sum += score[i];
				}
				avg = sum/score.length;
				System.out.println("최고점수 : "+max);
				System.out.println("평군점수 : "+avg);
				for(int i=0; i<score.length; i++) {
					for(int j=i+1; j<score.length; j++) {
						if(score[i]<score[j]) {
							transfer = score[i];
							score[i] = score[j];
							score[j] = transfer;
						}
					}
					System.out.println(score[i]);
				}
			} else if(select == 5) {
				System.out.println("종료합니다");
				run = false;
			}
		}
		
		
		
		scan.close();

	}

}
