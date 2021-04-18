package day13;

import java.util.*;

public class _ArrayList_Ex {

	public static void main(String[] args) {
		// ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고
		// 입력받은 단어를 모두 출력
		// 가장 긴 단어를 출력하시오
		String var = "abc";
		System.out.println(var.length()); // -> 문자열 길이 측정법!
		
		
		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		// 단어 입력
		for(int i=1; i<=5; i++) {
			System.out.print("단어를 입력하세요 : ");
		    String word = scan.next();
		    list.add(word);
		    // list.add(scan.next());
		}
		
		// 단어 출력
		for(int j=0; j<list.size(); j++) {
			System.out.println(list.get(j));
		}
		
		// 가장 긴 단어 출력
		String max = "a";
		for(int k=0; k<list.size(); k++) {
			if(max.length()<list.get(k).length()) {
				max = list.get(k);
			}
		}
		System.out.println(max);
		
		// 이렇게도!
		int longWord = 0;
		for(int i=1; i<list.size(); i++) {
			if(list.get(longWord).length() < list.get(i).length()) {
				longWord = i;
				// list.get(longWord).length() = list의 0번 인덱스 값의 길이
			}
		}
		System.out.println("가장 긴 단어는 "+list.get(longWord));
		
		
		scan.close();

	}

}
