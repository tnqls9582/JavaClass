package day14;

import java.util.List;

public class PeopleService {
	
	// ArrayList를 받아와서 출력하는 메소드 선언
	// ArrayList를 받아오기 위한 매개변수 필요
	void listPrint(List<People> list1) {
		System.out.println("listPrint 호출");
		System.out.println(list1.get(0));
		
		list1.get(1).setName("ps에서 변경");
		System.out.println(list1.get(1));
	}
	
    void peoplePrint(People peo) {
    	System.out.println("peoplePrint 호출");
    	System.out.println(peo);
    }
	
	
	

}
