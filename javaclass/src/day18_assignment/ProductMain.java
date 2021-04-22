package day18_assignment;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProductDTO product = null;
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		ProductService ps = new ProductService();
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.상품등록 2.전체상품조회 3.상품정보수정 4.상품삭제 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
		    int select = scan.nextInt();
		    if(select == 1) {
		    	int pNumber = productList.size()+1;
		    	System.out.print("상품명 : ");
		    	String pName = scan.next();
		    	System.out.print("상품가격 : ");
		        String pPrice = scan.next();
		        System.out.print("상품재고 : ");
		        int pStock = scan.nextInt();
		    	product = new ProductDTO(pNumber,pName,pPrice,pStock);
		    	productList.add(product);
		    } else if(select == 2) {
		    	ps.productList(productList);
		    } else if(select == 3) {
		    	productList = ps.productUpadte(productList);
		    } else if(select == 4) {
		    	productList = ps.productRemove(productList);
		    } else if(select == 5) {
		    	System.out.println("종료합니다.");
		    	run = false;
		    }
		}
		
		scan.close();

	}

}
