package day08;

public class Class1_WhileRandom {

	public static void main(String[] args) {
		// 주사위 게임 (실행시 숫자가 6이 나오면 종료되는 프로그램)

		boolean run = true;
		while (run) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				System.out.println("6이 나왔네요 종료합니다.");
				run = false;
			}

		}
		
		
		// 주사위 게임 2 (두 개의 주사위를 던져서 두 개의 합이 5이면 종료되는 프로그램)
		
	    boolean run1 = true;
	    while (run1) {
	    	int num1 = (int)(Math.random()*6)+1;
	    	int num2 = (int)(Math.random()*6)+1;
	    	System.out.print(num1);
	    	System.out.println("/"+num2);
	    	if((num1+num2) == 5) {
	    		
	    		run1 =false;
	    	}
	    }
	    System.out.println("종료되었습니다.");
		
		
		

	}

}
