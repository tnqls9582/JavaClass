package day08;

public class Class4_WhileEx {

	public static void main(String[] args) {
		// 숫자가 1 -2 3 -4 5 -6 ... 으로 있다고 할 때
		// 이들의 합이 100이 넘을 때의 숫자를 출력하시오
		
		int num = 0; // 합계용 변수
		int sum = 0; // 숫자용 변수 (1,-2,3,-4,...)
		int count = 1; // 카운트용 변수 (1,2,3,4,...)
		int s = 1; // 부호용 변수
		boolean run = true;
		while(run) {
			sum = sum + num;
			if(sum>=100) { // 100을 넘으면 종료한다!
				run = false;
			} else {
				num = s * count;
				s = -s;
				count++;
				System.out.println("현재 num,s,count값 : "+num+","+s+","+count);
			}
		}
		System.out.println("숫자 : "+num);
		System.out.println("합계 : "+sum);
		
		
		
		

	}

}
