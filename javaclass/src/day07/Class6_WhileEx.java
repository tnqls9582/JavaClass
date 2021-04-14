package day07;

public class Class6_WhileEx {

	public static void main(String[] args) {
		// while문을 이용하여 1부터 10까지의 합 출력하기
		// 2단계 -> 1+2+3+4+5+6+7+8+9+10=55 형태로 출력하기
		
		int i = 1, sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		int j = 1, sum1 = 0;
		while(j<=10) {
			sum1 += j;
			System.out.print(j);
			if(j<10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			j++;
		}
		System.out.println(sum1);
		
		

	}

}
