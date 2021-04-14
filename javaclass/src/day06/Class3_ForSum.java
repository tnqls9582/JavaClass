package day06;

import java.util.Scanner;

public class Class3_ForSum {

	public static void main(String[] args) {
		// 1부터 10까지의 합 구하기 55
		
		int sum = 0;
	    for(int i=1; i<=10; i++) {
	    	sum = sum + i; //sum+=i
	    }
		System.out.println(sum);
	    
	    
		
	    // 1+2+3+4+5+6+7+8+9+10=55
		// 를 출력하는 for문
	    int sum1 = 0;
	    for(int i=1; i<=10; i++) {
	        if(i!=10) {
	        	System.out.print(i+"+");
	        } else {
	        	System.out.print(i);
	        }
	        sum1 = sum1+i;
	    }
	    System.out.println("="+sum1);
	    
	    // 이렇게도!
	    int sum2 = 0;
	    for(int i=1; i<=10; i++) {
	    	sum2 += i;
	    	System.out.print(i);
	    	if(i<=9) {
	    		System.out.print("+");
	    	} else {
	    		System.out.print("=");
	    	}
	    }
	    System.out.println(sum2);
	    
	    
	    
	    // scanner 사용해서
	    // 1+2+3+4+5+6+7+8+9+10=55
	    Scanner scan = new Scanner(System.in);
	    int start = 0, end = 0, sum3 = 0;
	    System.out.print("시작값을 입력하세요 : ");
	    start = scan.nextInt();
	    System.out.print("끝값을 입력하세요 : ");
	    end = scan.nextInt();
	    
	    for(int i=start; i<=end; i++) {
	    	sum3 += i;
	    	System.out.print(i);
	    	if(i<end) {
	    		System.out.print("+");
	    	} else {
	    		System.out.print("=");
	    	}
	    } 
	    System.out.println(sum3);
	    System.out.println(start+"부터 "+end+"까지의 합은 "+sum3+"입니다.");
	    
	    
	    scan.close();
	    

	    
	    
	    
	}

}
