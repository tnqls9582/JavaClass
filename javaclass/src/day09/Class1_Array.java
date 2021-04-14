package day09;

public class Class1_Array {

	public static void main(String[] args) {
		/*
		 * 배열(Array)
		 * 같은 타입의 데이터를 하나의 배열 변수에 여러 개를 담을 수 있게 함
		 */
		
		// 정수 타입의 number 라는 이름의 배열 변수 선언
		int[] number;
		int number1[];
		
		// 배열 선언과 동시에 초기값을 주자!
		int[] number2 = {1,2,3};
		String[] strArray = {"가나다","abc","가1a~!"};
		int[] number3 = {4,5,6,7,20,100};
		
		
		// number3의 100을 출력해보자!
		// -> 여섯번째 칸에 있는 값을 출력해야됨
		// System.out.println(number3[6]); -> 오류!!
		// 0번 인덱스 부터 시작 -> 여섯번째는 5번 인덱스
		System.out.println(number3[5]);
		
		
		// number3의 4번 인덱스 값을 500으로 변경해보자!
		System.out.println(number3[4]); // 변경 전
		number3[4] = 500;
		System.out.println(number3[4]); // 변경 후
		
		
		// 배열이름.length : 배열의 크기를 알려줌(몇개의 값이 있다)
		// 인덱스보다 1이 더 크다
		// number3의 크기 : 6
		// number3의 인덱스 : 0~5
		System.out.println(number3.length);
		
		
		// for문을 이용하여 배열에 저장된 값 출력하기
		System.out.println(number3[0]);
		System.out.println(number3[1]);
		System.out.println(number3[2]);
		System.out.println(number3[3]);
		System.out.println(number3[4]);
		System.out.println(number3[5]);
		
		for(int i=0; i<number3.length; i++) {
			System.out.println(number3[i]);
		}
		
		
		// number4 배열 변수에 저장된 값을 총합과 평균을 출력해보자!
		int[] number4 = {1,6,10,100};
		int sum = 0;
		for(int i=0; i<number4.length; i++) {
			sum += number4[i];
		}
		System.out.println(sum);
		System.out.println(sum/number4.length);
		
		
		// 초기값을 주지 않고 배열 선언
		int[] number5 = null;
		number5 = new int[5];
		
		int[] number6 = new int[6]; // 값(칸)이 6개인 배열변수를 만들었다!
		
		System.out.println(number6.length);
		System.out.println(number6[5]); // 기본적으로 0이 셋팅되어있다(정수형일때)
		
		
		
		
		
		

	}

}
