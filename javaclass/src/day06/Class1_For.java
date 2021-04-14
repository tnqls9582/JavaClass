package day06;

public class Class1_For {

	public static void main(String[] args) {
		/*
		 * for문(반복문)
		 * 반복문 : 어떠한 조건에서 똑같은 내용을 계속 반복실행해야 할 때
		 *        그리고 특정 조건에 도달하면 반복을 멈춤
		 * 반복조건, 반족종료조건(특정값 또는 특정횟수)
		 */
		
		// 1,2,3,4,5를 서로 다른 줄에 출력해보세요
//	    System.out.println("1");
//	    System.out.println("2");
//	    System.out.println("3");
//	    System.out.println("4");
//	    System.out.println("5");
	    
	    
	    System.out.println("for문 시작전");
	    
	    for(int i=1; i<=3; i++) { // i=1(반복변수 선언 및 초깃값 설정) i<=3(반복변수 종료 조건) i++(반복변수 증감식)
	    	// 반복변수(i)는 반복횟수를 지정하기 위해서도 사용하지만
	    	// 반복변수를 일정하게 증가시키거나 감소시킬 수 있기 때문에 값을 연산에 사용하기도 함
	    	System.out.println("for문 내부");
	    	System.out.println("반복변수 i값 : "+i);
	    }   // i=1 과 i<=3 조건 맞는지 확인 후 sysout출력.
	        // 그 후 i++ -> 윗순서로 반복
	    
	    System.out.println("for문 종료후");
	    // 반복변수값 확인 - 반복조건체크 - for 블록 안의 내용 실행 - 반복변수증감식 적용 - 반복조건체크 - for 블록 안의 내용 실행
	    // 반복조건체크시 조건에 맞지 않다면 for 블록내용 실행하지 않고 종료
	    
	    
	    
	   
	    
	    
	    
	    

	}

}
