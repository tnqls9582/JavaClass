package day14;

import java.util.*;

public class PeopleMain {

	public static void main(String[] args) {
		// People 클래스 객체를 3개 만들어서 각각 필드값을 입력(기본생성자 활용)
		// peopleList 라는 ArrayList에 저장
		// ArrayList에 담긴 모든 데이터 출력
		
	    People p1 = new People();
	    p1.setName("사람1");
	    p1.setrNumber("210416-3123456");
	    p1.setAddress("인천광역시");
	    p1.setAge(11);
	    
	    People p2 = new People("사람2","210416-4987654","서울특별시",15);
	    
	    People p3 = new People();
	    p3.setName("사람3");
	    p3.setrNumber("210416-3111111");
	    p3.setAddress("경기도");
	    p3.setAge(20);
	    
	    List<People> peopleList = new ArrayList<People>();
	    
	    peopleList.add(p1);
	    peopleList.add(p2);
	    peopleList.add(p3);
	    
	    System.out.println(peopleList.get(0).getName());
	    
	    // 출력
	    for(int i=0; i<peopleList.size(); i++) {
	    	System.out.println(peopleList.get(i).getName());
	    	System.out.println(peopleList.get(i).getrNumber());
	    	System.out.println(peopleList.get(i).getAddress());
	    	System.out.println(peopleList.get(i).getAge());
	    }
	    
	    // People클래스에 있는 to string 메소드 이용해서 간단하게!
	    for(int i=0; i<peopleList.size(); i++) {
	    	System.out.println(peopleList.get(i));
	    }
	    
	    
		System.out.println(peopleList.get(0));
		System.out.println(p1.toString()); 
		
		
		// PeopleService 클래스 객체 선언
	    PeopleService ps = new PeopleService();
	    // listPrint 메소드 호출 (호출하면서 넘겨줌)
	    System.out.println("listPrint 호출전");
	    ps.listPrint(peopleList);
	    System.out.println("listPrint 호출끝");
	    
	    for(int i=0; i<peopleList.size(); i++) {
	    	System.out.println(peopleList.get(i));
	    }
		
		ps.peoplePrint(p2);
		
		
		

	}

}
