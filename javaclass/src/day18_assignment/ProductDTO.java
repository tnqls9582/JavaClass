package day18_assignment;

public class ProductDTO {
	private int pNumber;
	private String pName;
	private String pPrice;
	private int pStock;
	
	ProductDTO() {
		
	}
	
	ProductDTO(int pNumber, String pName, String pPrice, int pStock) {
		this.pNumber = pNumber;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pStock = pStock;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	@Override
	public String toString() {
		return "ProductDTO [pNumber=" + pNumber + ", pName=" + pName + ", pPrice=" + pPrice + ", pStock=" + pStock
				+ "]";
	}

}
