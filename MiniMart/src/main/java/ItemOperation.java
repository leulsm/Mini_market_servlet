import java.util.ArrayList;
import java.util.List;

public class ItemOperation {
	public static List<itemDetail> idet=new ArrayList<>();
	
	public itemDetail findItem(String itemcode) {
		for(itemDetail item:idet) {
			try {
				if(item.getItemCode().equals(itemcode)) {
					return item;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public int update(itemDetail item) {
		for(int i=0;i<idet.size();i++) {
			if(idet.get(i).getItemCode().equals(item.getItemCode())) {
				idet.set(i, item);
				return i;
			}
		}
		return -1;
	}
	public int save(itemDetail item) {
		if(findItem(item.getItemCode())!=null) {
			update(item);
		}else {
			idet.add(item);
		}
		return 1;
	}
	public int delete(String itemCode) {
		itemDetail item=findItem(itemCode);
		if(item!=null) {
			idet.remove(item);
			return 1;
		}
		return -1;
	}
	public List<itemDetail> getAll(){
		return idet;
	}
}
