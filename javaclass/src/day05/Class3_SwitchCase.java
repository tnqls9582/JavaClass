package day05;

public class Class3_SwitchCase {

	public static void main(String[] args) {
		
		// 조건문 switch case
		
		int num = 0;
		
		switch (num) {
		case 0:
			System.out.println("num값이 0이네요");
		    break;
		case 1:
			System.out.println("num값이 1이네요");
			break;
		default:
			System.out.println("case에서 지정한 값이 아닐 때 실행됩니다");
			break;
		}
		
		
		String str = "가";
		
		switch (str) {
		case "가":
			System.out.println("가");
			break;
		case "나":
			System.out.println("나");
			break;
		default:
			System.out.println("지정값이 아닐 때");
			break;
		}
		
		
		

	}

}
