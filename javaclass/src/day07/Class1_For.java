package day07;

public class Class1_For {

	public static void main(String[] args) {
		// 10부터 1까지 출력하기
	    for(int i=10; i>=1; i--) {
	    	System.out.println(i);
	    }
		
		
	    // 중첩 for문
	    System.out.println("i for문 시작");
	    for(int i=1; i<=2; i++) { // 1 2 7
	    	System.out.println("j for문 시작");
	        for(int j=1; j<=3; j++) { // 3 4 6
	        	System.out.print("i값 : "+i);
	        	System.out.println(" / j값 : "+j); // 5
	        }
	        System.out.println("j for문 끝");
	    }
	    System.out.println("i for문 끝");
	    
	    // 실행순서
	    // 1-2-3-4-5  : i=1/j=1
	    // -6-4-5     : i=1/j=2
	    // -6-4-5     : i=1/j=3
	    // -7-2-3-4-5 : i=2/j=1
	    // -6-4-5     : i=2/j=2
	    // -6-4-5     : i=2/j=3
	    // -7 (i=3이 되기 때문에 중지)
	    
		

	}

}
