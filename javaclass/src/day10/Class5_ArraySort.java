package day10;

public class Class5_ArraySort {

	public static void main(String[] args) {
		// 배열 정렬(버블 정렬)
		// 오름차순 또는 내림차순 정렬
		// 중첩 for문

		int[] num = { 3, 2, 1, 5, 4 };
		// 1,2,3,4,5 로 정렬하기

		int transfer = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]>num[j]) {
					transfer = num[j];
					num[j] = num[i];
					num[i] = transfer;
				}
			}
			System.out.print(num[i]);
		}
		
		
		

	}

}
