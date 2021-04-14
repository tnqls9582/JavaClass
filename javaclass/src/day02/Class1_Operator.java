package day02;

public class Class1_Operator {

	public static void main(String[] args) {
        // 텍스트 또는 변숫값 출력
		// print, println 메소드
		System.out.println("텍스트");
		// 변수
		// 어떠한 값을 담기 위한 공간
		// 변수 선언방법 - 변수타입 변수이름;
		//           - 변수타입 변수이름 = 값;
		// 변수 사용방법 - 변수이름 = 값;
		// 변수 타입 (정수/실수/논리/문자열)
		// ----------21.03.30복습------------
		
		// ------------21.03.31-------------
		/*
		 * 변수 선언, 값 대입, 출력
		 * var1 : 10을 가지고 있는 정수형변수
		 * var2 : 0.1234를 가지고 있는 실수형변수
		 * var3 : true를 가지고 있는 논리형변수
		 * var4 : 오늘은 수요일 을 가지고 있는 문자열변수
		 * 선언 및 값 대입 후
		 * 1,2,3,4의 값을 각각 출력.
		 */
		int var1 = 10;
		double var2 = 0.1234;
		boolean var3 = true;
		String var4 = "오늘은 수요일";
		
		System.out.println("var1 : " + var1); // ""후 + 는 연결역할
		System.out.println(var1 + var2); // 찐 덧셈
		System.out.println(var2);
		System.out.println(var3);
	    System.out.println(var4);
	    
	    // var5 라는 정수형변수 선언
	    int var5;
	    // int var5; // var5 중복선언 불가능
	    // 변수를 사용할 때 어떤 값을 대입하는 등의 내용 필요
	    var5 = 10;
	    int var6;
	    var6 = 8;
	    System.out.println("var5 : "+var5);
	    System.out.println("var6 : "+var6);
	    
	    var5 = var6;
	    // var6 값을 var5에 대입 (복사개념)
	    // var5와 var6 값 각각 출력
	    System.out.println("var5 : "+var5);
	    System.out.println("var6 : "+var6);
	    
	    int sum = 0;
	    sum = var5 + var6; // var5 + var6 결과를 sum에 대입 (8+8=sum)
	    System.out.println("sum : "+sum);
	    // 변수 값은 언제든 바뀔 수 있다
	    
	    //~~~~~수빈이연습~~~~~~~
	    int var7 = 4;
	    int var8 = 100;
	    int sum1 = 0;
	    sum1 = var7+var8; // var7(4)+var8(100) 이 sum1값에 대입
	    System.out.println("sum1 : "+sum1);
	    sum1 = 432; // 변수는 변함
	    System.out.println("sum1 : "+sum1);
	    
	    System.out.println("var7 : "+var7);
	    System.out.println("var8 : "+var8);
	    
	    var7 = var8; // var8이 var7이 됐음!!
	    System.out.println("var7 : "+var7);
	    System.out.println("var8 : "+var8);
	    
	    
	    //----------------------------------
	    /* 산술연산자(Operator) : 연산(계산)에 사용하는 기호
	     * + 덧셈
	     * - 뺄셈
	     * * 곱셈
	     * / 나눗셈
	     * % 나눗셈 후 나머지값
	     */
	    // 정수형변수 2개를 선언하여 각각의 연산자 계산결과를 출력
	    int num1 = 34;
	    int num2 = 5;
	    
	    System.out.println(num1+num2);
	    
	    int result;
	    result = num1 + num2;
	    System.out.println("+ 결과 : "+result);
	    
	    result = num1 * num2;
	    System.out.println("* 결과 : "+result);
	    
	    result = num1 / num2; // int는 정수형 변수 - 소수점 안나옴
	    System.out.println("/ 결과 : "+result);
	    // 정수형 변수간의 나눗셈 결과값은 몫이다
	    
	    result = num1 % num2;
	    System.out.println("% 결과 : "+result);
	    // 나눗셈 후 나머지 표시
	    
	    
	    double num3, num4;
	    double result1;
	    num3 = 5.0;
	    num4 = 3.0;
	    result1 = num3/num4;
	    System.out.println("/ 결과 : "+result1);
	    
	    
	    String strVar1 = "스트링타입의 변수값";
	    String strVar2 = "은 연결 할 수 있음";
	    String strVar3;
	    strVar3 = strVar1 + strVar2;
	    System.out.println(strVar3);
	    
	    //--------------------------------------
	    /* 비교연산자
	     * <, >, <=, >=, ==, !=
	     * 결과값 true, false 로 표시
	     * a == b (두 값을 비교해서 같으면 t 다르면 f)
	     * a != b (두 값을 비교해서 같으면 f 다르면 t)
	     */
	    // 두개의 정수형 변수를 선언하여 각각의 비교연산 결과값을 출력
	    int num5, num6;
	    num5 = 40;
	    num6 = 25;
	    System.out.println("> 결과 : "+ (num5 > num6));
	    boolean result2;
	    result2 = num5>num6;
	    System.out.println("> 결과 : "+result2);
	    result2 = num5<=num6;
	    System.out.println(result2);
	    result2 = num5==num6;
	    System.out.println(result2);
	    
	    
	    //---------------------------------
	    /* 대입연산자
	     * +=, =+, *=, /=, %=
	     * a+=b -> a=a+b
	     */
	    // 정수형 변수 2개를 선언해서 대입연산자 수행 결과를 출력
	    int num7, num8;
	    num7 = 5;
	    num8 = 3;
	    System.out.println(num7+=num8);
	    System.out.println(num7); // 위에 값 대입되어 num7값 바뀜 (8)
	    System.out.println(num7*=num8); // num7값 8로 변경되어 결과값24
	    
	    
	    //-----------------------------
	    /* 논리연산자
	     * a,b에 올 수 있는 요소
	     * - 논리형(boolean) 변수
	     * - T/F 로 나오는 식(비교연산식)
	     * 1. &&(AND 연산자) : a && b
	     *   a,b 모두 t면 결과는 t
	     *   a,b 둘 중 하나라도 f면 결과는 f
	     * 2. ||(OR연산자) : a || b
	     *   a,b 둘 중 하나라도 t면 결과는 t
	     *   a,b 모두 f면 결과는 f
	     * 3. !(NOT 연산자) : !a
	     *   a가 t면 f로
	     *   a가 f면 t로
	     */
	    boolean result3;
	    result3 = true && true; // 예상 : T
	    System.out.println(result3);
	    result3 = true && false; // 예상 : F
	    System.out.println(result3);
	    result3 = false || true; // 예상 : T
	    System.out.println(result3);
	    result3 = false || false; // 예상 : F
	    System.out.println(result3);
	    
	    result3 = (5>3) && (5==3); // 예상 : F
	    System.out.println(result3);
	    
	    boolean var11 = true;
	    System.out.println(!var11);
	    
	    
	}

}
