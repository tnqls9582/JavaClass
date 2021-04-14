package day05;

import java.util.Scanner;

public class Class2_IfEx {

	public static void main(String[] args) {
		/*
		 * 서로 다른 숫자 세 개를 입력받아 가장 큰 숫자 출력하기 (단, 같은 숫자는 입력되지 않는다고 가정)
		 */
		
	    Scanner scan = new Scanner(System.in);
	    int num1=0, num2=0, num3=0;
	    System.out.print("1번 : ");
	    num1 = scan.nextInt();
	    System.out.print("2번 : ");
	    num2 = scan.nextInt();
	    System.out.print("3번 : ");
	    num3 = scan.nextInt();
	    
	    if(num1>num2 && num1>num3) {
	    	System.out.println(num1+"이 가장 큰 수");
	    } else if(num2>num1 && num2>num3) {
	    	System.out.println(num2+"이 가장 큰 수");
	    } else if(num3>num1 && num3>num2) {
	    	System.out.println(num3+"이 가장 큰 수");
	    }
	    
	    
	    // 이 방법도!
	    // max 라는 변수를 이용해서 "가장 큰 수는 num 입니다." 한줄만 출력
	    int max = 0;
	    
	    if(num1>num2) {
	    	if(num1>num3) {
	    		max = num1;
	    		//System.out.println(num1+"이 가장 큰 수");
	    	} else {
	    		max = num3;
	    		//System.out.println(num3+"이 가장 큰 수");
	    	}
	    } else {
	    	if(num2>num3) {
	    		max = num2;
	    		//System.out.println(num2+"이 가장 큰 수");
	    	} else {
	    		max = num3;
	    		//System.out.println(num3+"이 가장 큰 수");
	    	}
	    }
	    System.out.println("가장 큰 수는 "+max+"입니다.");
	    
	    
	    scan.close();
		
		

	}

}
