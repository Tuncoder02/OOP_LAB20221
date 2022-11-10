
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[]=
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int numberorder = 0;
	//add
	public int addDigitalVideoDisc(DigitalVideoDisc Disc) {
		if(numberorder == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full!");
			return 0;
		}else {
			itemsOrdered[numberorder++] = Disc;
			System.out.println("successfull!");
			return 1;
		}
	}
	//remove
	public int removeDigitalVideoDisc(DigitalVideoDisc Disc) {
		int status = 0;
		for(int i=0;i<numberorder;i++) {
			if(Disc.getTitle().equals(itemsOrdered[i].getTitle())) {
				itemsOrdered[i] = itemsOrdered[numberorder-1]; // lưu phần tử cuối cùng cho i
				itemsOrdered[numberorder-1] = null;  //xóa phần tử cuối cùng
				numberorder--;
				status = 1;
				System.out.println("successfull!");
				continue;
			}
		}
		if(status == 0)
			System.out.println("NOT FOUND");
		return status;
	}
	public float totalCost() {
		float totalCost = 0;
		for(int i=0; i<numberorder; i++ ) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;}

}
