
import java.util.Scanner;
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
	public int addDigitalVideoDisc(DigitalVideoDisc[] dvdlist)
	{   for(DigitalVideoDisc Disc: dvdlist)
			   if(numberorder == MAX_NUMBERS_ORDERED) {
					System.out.println("The cart is full!");
					return 0;
				}else {
					itemsOrdered[numberorder++] = Disc;
					System.out.println("successfull!");
					
				}
		return 1;
	}
	public int addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
	{
		if(numberorder == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full!");
			return 0;
		}else {
			itemsOrdered[numberorder++] = dvd1;
			System.out.println("added dvd1!");
		}
		if(numberorder == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full!");
			return 0;
		}else {
			itemsOrdered[numberorder++] = dvd2;
			System.out.println("added dvd2");
		}
		return 1;
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
	 
	public void searchCartId() {
	    	int id, sum = 0;
	    	Scanner keyboard =  new Scanner(System.in);
	    	System.out.println("nhap ID: ");
	    	id = keyboard.nextInt(); 
	    	for(int i = 0; i < numberorder; i++) {
	    		if(id == itemsOrdered[i].id) {
	    			System.out.println(itemsOrdered[i].toString());
	    			sum ++;
	    			break;
	    		}
	    	}
	    		
	    		
	    	if(sum == 0) {
	    		System.out.println("Found\n");
	    	}

	    	
	    }
	//tìm theo tiêu đề
	
	public void searchCartTitle() {
		String title1;
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		String checkString = "1";
		System.out.println("Input title: ");
		title1 = keyboard.nextLine();
		for(int i = 0; i < numberorder; i++) {
			if(itemsOrdered[i].trungTitle(title1) == true) {
				System.out.println(itemsOrdered[i].toString());
				sum ++;
				break;
			}
		}
		if(sum == 0) {
			System.out.println("Found!");
		}
		}
	//in xe đẩy 
	public void printCart() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        //System.out.println("1. " +itemsOrdered[0].toString());
	        for(int i = 0; i < numberorder; i++) {
	        	int j = i+1;
	        	System.out.println(j + ". " +itemsOrdered[i].toString());
	        }
	        System.out.println("Total cost: " + totalCost());
	        System.out.println("***************************************************");
	        
	    }
}
