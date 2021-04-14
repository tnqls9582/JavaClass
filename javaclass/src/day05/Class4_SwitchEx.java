package day05;

import java.util.Scanner;

public class Class4_SwitchEx {

	public static void main(String[] args) {
		/* 단어를 입력받아서 사용
		 * desk : 책상입니다.
		 * chair : 의자입니다.
		 * monitor : 모니터입니다.
		 * mouse : 마우스입니다.
		 * 없는 단어 일 때 : 사전에 없는 단어입니다.
		 */
		
	    Scanner scan = new Scanner(System.in);
	    String word = "";
	    System.out.print("단어를 입력하세요 : ");
	    word = scan.next();
	    
	    switch (word) {
	    case "desk":
	    	System.out.println("책상입니다.");
	    	break;
	    case "chair":
	    	System.out.println("의자입니다.");
	        break;
	    case "monitor":
	    	System.out.println("모니터입니다.");
	    	break;
	    case "mouse":
	    	System.out.println("마우스입니다.");
	    	break;
	    default:
	    	System.out.println("사전에 없는 단어입니다.");
	    	break;
	    }
	    
	    
	    scan.close();
		

	}

}
