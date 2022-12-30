
public class itemDetail {
    String iName;
    String iNo;
    String price;
    String iCatagorie;
    String itemCode;
	
	itemDetail(String iName,String iNo,String itemCode,String price,String iCatagorie){
		this.iName=iName;
		this.iNo=iNo;
		this.price=price;
		this.iCatagorie=iCatagorie;
		this.itemCode=itemCode;
	}

	public  String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public String getiNo() {
		return iNo;
	}

	public void setiNo(String iNo) {
		this.iNo = iNo;
	}
	

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getiCatagorie() {
		return iCatagorie;
	}

	public void setiCatagorie(String iCatagorie) {
		this.iCatagorie = iCatagorie;
	}
    
}
