package day08;

import java.util.Scanner;

public class Class5_WhileEx {

	public static void main(String[] args) {
		// Up & Down
		// 1-100까지의 숫자
		
	    Scanner scan = new Scanner(System.in);
	    int num = (int)(Math.random()*100)+1;
	    int enter = 0 , i = 0;
	    boolean run = true;
	    
	    while(run) {
	    	System.out.print("1부터 100까지의 숫자를 입력하세요 : ");
	    	enter = scan.nextInt();
	    	i++;
	    	if(enter<num) {
	    		System.out.println("더 큰 수를 입력하세요.");
	    	} else if(enter>num) {
	    		System.out.println("더 작은 수를 입력하세요.");
	    	} else if(enter==num) {
	    		System.out.println("맞췄습니다.");
	    	    run = false;
	    	} 
	    }
	    System.out.println("시도 횟수는 "+i+"번 입니다.");
	    
	    
	    
	    scan.close();
	    
	    

	}

}
