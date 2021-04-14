package day10;

import java.util.Scanner;

public class Class4_ArrayCoin {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
	    int[] coin = {500, 100, 50, 10};
	    int money = 0;
	    int coin500=0, coin100=0, coin50=0, coin10=0;
	    System.out.print("금액 입력 : ");
	    money = scan.nextInt();
	    
	    coin500 = money/coin[0];
	    coin100 = (money-coin[0]*coin500)/coin[1];
	    coin50 = (money-coin[0]*coin500-coin[1]*coin100)/coin[2];
	    coin10 = (money-coin[0]*coin500-coin[1]*coin100-coin[2]*coin50)/coin[3];
	    
	    System.out.println("500원 : "+coin500+"개");
	    System.out.println("100원 : "+coin100+"개");
	    System.out.println("50원 : "+coin50+"개");
	    System.out.println("10원 : "+coin10+"개");
	    
	    
	    // for문
	    int change = 0;
	    System.out.print("금액 입력 : ");
	    change = scan.nextInt();
	    
	    for (int i=0; i<coin.length; i++) {
	    	// 동전의 갯수 출력
	    	int coinCount = change/coin[i];
	    	System.out.println(coin[i]+"원 동전 : "+coinCount+"개");
	        // 나머지 값을 사용하기 위한 식
	    	change = change % coin[i];
	    }
		
	    
	    scan.close();
		
		

	}

}
