package day18_assignment;

import java.util.*;

public class ProductService {
	
	Scanner scan = new Scanner(System.in);

	public void productList(List<ProductDTO> productList) {
		for(int i=0; i<productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
	}
	

	public List<ProductDTO> productUpadte(List<ProductDTO> productList) {
		System.out.print("상품번호 : ");
	    int pNumber = scan.nextInt();
	    for(int i=0; i<productList.size(); i++) {
	    	if(pNumber == productList.get(i).getpNumber()) {
	    		System.out.print("상품가격 수정 : ");
	    		String pPrice = scan.next();
	    		System.out.print("재고량 수정 : ");
	    	    int pStock = scan.nextInt();
	    	    productList.get(i).setpPrice(pPrice);
	    	    productList.get(i).setpStock(pStock);
	    	    System.out.println(productList.get(i));
	    	}
	    }
		return productList;
	}
	

	public List<ProductDTO> productRemove(List<ProductDTO> productList) {
		System.out.print("상품번호 : ");
	    int pNumber = scan.nextInt();
	    for(int i=0; i<productList.size(); i++) {
	    	if(pNumber == productList.get(i).getpNumber()) {
	    		productList.remove(i);
	    		System.out.println("삭제되었습니다.");
	    	}
	    }
		return productList;
	}
	
	
	
	
	
	

}
