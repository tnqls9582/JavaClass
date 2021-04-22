package day18;

public class Class2_TryCatch {

	public static void main(String[] args) {
		// 나눗셈을 할 때 a/b에서 b가 0이면 발생하는 예외 확인
		// 예외처리를 할 수 있는 코드를 작성
		// 예외가 발생하는 경우 "0으로 나눌 수 없습니다" 출력
		
		
	    try {
	    	int num1 = 5, num2 = 0;
			int num3 = num1/num2;
	    } catch(ArithmeticException e) {
	    	System.out.println("0으로 나눌 수 없습니다.");
	    } catch(Exception e) {
	    	System.out.println("다른 예외");
	    }
		
		

	}

}
