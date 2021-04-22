package day18;

public class Class_TryCatch {

	public static void main(String[] args) {
		// 예외(Exception)처리
		/* try {
		 *   실행할 내용
		 * } catch(익셉션이름 e) {
		 *   해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 */
		
	    try {
	    	int[] num = new int[3];
			num[3] = 10;
			System.out.println("try 마지막줄");
	    } catch(Exception e) {
	    	System.out.println("배열크기 초과");
	        e.printStackTrace();
	    } finally {
	    	System.out.println("예외가 나던 안나던 무조건 나오는 부분");
	    }
		
	    System.out.println("try catch 끝");

	}

}
