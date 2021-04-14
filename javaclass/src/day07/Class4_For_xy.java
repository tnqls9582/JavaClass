package day07;

import java.util.Scanner;

public class Class4_For_xy {

	public static void main(String[] args) {
		// 4x + 5y = 60 을 만족하는 모든 x,y값을 출력하세요.
		// x,y는 1보다 크고 10보다 작거나 같은 정수
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x)+(5*y)==60) {
					System.out.println(x+"/"+y);
				}
			}
		}
		
		
		
		// 숫자를 입력받아 1~n까지 2,3의 배수를 제외한 합계
	    Scanner scan = new Scanner(System.in);
	    int num = 0, sum = 0;
	    System.out.print("숫자 입력 : ");
	    num = scan.nextInt();
	    
	    for(int j=1; j<=num; j++) {
	    	if(j%2 != 0 && j%3 != 0) {
	    		sum += j;
	    	} else {
	    		
	    	}
	    }
	    System.out.println(sum);
	    
	    // 이렇게도!
	    int num1 = 0, sum1 = 0;
	    System.out.print("숫자 입력 : ");
	    num1 = scan.nextInt();
	    
	    for(int j=1; j<=num1; j++) {
	    	if(j%2 == 0 || j%3 == 0) {
	    		
	    	} else {
	    		sum1 += j;
	    	}
	    }
	    System.out.println(sum1);
		
		
	    
	    scan.close();
		

	}

}
