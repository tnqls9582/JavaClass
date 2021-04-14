package day10;

public class Class1_ArrayNew {

	public static void main(String[] args) {
		// 배열 이름만 선언한 것(크기나 데이터에 대한 것은 전혀 없음)
		
		int[] num = null;
		
		if(true) {
			System.out.println("if문 내부");
			num = new int[5]; // num 이라는 변수를 크기가 5인 배열로 만듦 (true일 때 사용이 가능)
			System.out.println(num.length); // 크기 5가 출력
		}
		
		System.out.println("if문 끝");
		System.out.println(num.length); // 크기 5가 출력
		
		
		// if문이 false일 때에는 조건문이 작용하지 않아서 16번 줄만 출력
		// 17번 줄은 오류로 뜸
		

	}

}
