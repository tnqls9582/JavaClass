package day03;

public class Class1_Increase {

	public static void main(String[] args) {
		//
		/*
		 * 증감연산자 (++ --)
		 * 변수 앞 또는 변수 뒤에 사용
		 * 위치에 따라 역할 변경
		 * ++var : var가 가지고 있는 값에 1을 증가시킨 뒤 연산에 사용
		 * var++ : var가 가지고 있는 값을 연산에 먼저 사용 후 var의 값만 1 증가
		 * 반복문, for문에서 주로 사용
		 */
		
	    int num1 = 10;
	    int num2 = 10;
	    int num3;
	    
	    // ++이 변수 앞에 붙을 때
	    System.out.println("num1 : "+num1); //10
	    num3 = ++num1 + 10;
	    System.out.println("num1 : "+num1); //11
	    System.out.println("num3 : "+num3); //21
	    
	    // ++이 변수 뒤에 붙을 때
	    System.out.println("num1 : "+num1); //11 (윗줄에 계산된 값 그대로 가지고 내려옴)
	    num3 = num1++ + 10; // 11+10 계산 후 num1의 값 1 증가
	    System.out.println("num1 : "+num1); //12
	    System.out.println("num3 : "+num3); //21 (증감연산자가 붙은 num1값만 변하므로 num3에는 영향없음)
	    
	    // -- 사용 시
	    num3 = --num1 + 10;
	    System.out.println(num1); //11
	    System.out.println(num3); //21
	    
	    num3 = num1-- + 10;
	    System.out.println(num1); //10
	    System.out.println(num3); //21
	    
	    // 혼합
	    num3 = num1++ + num2++;
	    System.out.println(num1); //11
	    System.out.println(num2); //11
	    System.out.println(num3); //20
	    
	    num3 = ++num1 + num2--;
	    System.out.println(num1); //12
	    System.out.println(num2); //10
	    System.out.println(num3); //23
	    
	    
	    
	    
	    
		
		

	}

}
