package day03;

public class Class4_RandomMethod {

	public static void main(String[] args) {
		// Random 메소드
		// 특정 범위 내에서 숫자를 하나 출력해주는 메소드
		// 1-10 사이의 숫자 하나를 무작위로 발생
		/* (int)(Math.random()*10)+1
		 * 10 자리에 올 수가 끝 수, 1 자리에 올 수가 시작 수 라고 생각하면 좋음
		 * random() 0보다 크거나 같고 1.0보다 작은 숫자 발생시킴
		 */
		
		System.out.println(Math.random());
		System.out.println((Math.random()*10));
		System.out.println((int)(Math.random()*10)); // 강제 형변환
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*50)+1);
		
		
	}

}
