package day07;

public class Class2_ForMulti {

	public static void main(String[] args) {
		// 중첩 for문을 이용하여 구구단 출력하기
		
	    for(int i=2; i<=9; i++) { // 몇단?
	    	for(int j=1; j<=9; j++) { // 곱해지는 수
	    		System.out.print(i+"x"+j+"="+(i*j));
	    		System.out.print("\t"); // tab
	    	}
	    	// System.out.println(); // j for바깥에(한 단 끝난 뒤 줄바꿈)
	    	System.out.print("\n");
	    }
		
		
		

	}

}
