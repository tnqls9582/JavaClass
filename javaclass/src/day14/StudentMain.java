package day14;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// Student 클래스 객체를 선언하고 필드값을 지정한 후
		// 이 객체를 ArrayList에 저장
		
		// 객체 선언
		Student s1 = new Student();
		
		// setter를 이용하여 필드값 지정
		// private으로 지정했기 때문에 접근 불가
//		s1.name = "김수빈";
		s1.setName("김수빈");
//		s1.phone = "010-1234-5678";
	    s1.setPhone("010-1234-5678");
//		s1.address = "인천광역시";
		s1.setAddress("인천광역시");
		
		// getter를 이용하여 필드값 가져오기
		String var1 = s1.getName();
		System.out.println(var1);
		System.out.println(s1.getAddress());
		
		
		
		Student s2 = new Student("김빈수","010-9876-5432","서울특별시");
		// 이름변경
		s2.setName("학생");
		
		// Student 객체를 담을 수 있는 ArrayList 필요
		// <>에 클래스의 이름을 적어준다.
		List<Student> sList = new ArrayList<Student>();
		
		// ArrayList에 저장
		sList.add(s1);
	    sList.add(s2);
		
		// sList의 0번 인덱스에 저장된 s1의 name값 출력
//	    System.out.println(sList.get(0).Name());
		System.out.println(sList.get(0).getName());
		
		String var = sList.get(0).getName();
		System.out.println(var);
		
		// sList의 1번 인덱스에 저장된 s2의 name값 출력
		System.out.println(sList.get(1).getName());
		
		// 이름 변경
//		sList.get(1).name = "학생2이름변경";
		sList.get(1).setName("학생2이름변경");
		System.out.println(sList.get(1).getName());
		
		

	}

}
