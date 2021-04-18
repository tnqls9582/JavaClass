package day13;

import java.util.*;

public class _ArrayList {

	public static void main(String[] args) {
		// ArrayList
		// Collection Framework : List, Set, Map
		
		
		// ArrayList 선언 (저장데이터 타입 : String)
		List<String> list = new ArrayList<String>();
		
		// list에 데이터 저장 : add 메소드 호출
		list.add("첫번째");
		list.add("두번째"); // l.20에 의해 인덱스가 1에서 2로 밀려남 -> l.21에 의해 3으로 밀려남
		list.add("세번째");
		list.add(1,"네번째"); // 앞의 숫자는 인덱스 번호를 의미 (밀어내기 가능)
		list.add(1,"다섯번째"); // l.20을 밀어내고 1번이 됨
		
		// list에 담긴 데이터 출력
		System.out.println(list.get(0)); // 숫자는 인덱스를 의미(0=첫번째값)
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// list 크기 확인
		System.out.println(list.size());
		
		// list 데이터 삭제
	    list.remove(1);
	    System.out.println(list.get(1)); // 인덱스를 비워두지 않고 밑 번호에서 채워줌
	    
	    // for문을 이용하여 list에 담긴 모든 데이터 출력
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    // list에 정수를 저장할 때
	    List<Integer> list1 = new ArrayList<Integer>(); // Wrapper Class
		
		

	}

}
