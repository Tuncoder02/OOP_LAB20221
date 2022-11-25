
	import java.util.ArrayList;
	public class Store {
		
		//tạo ds lk
		ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
		//remove
		public void removeDVD(DigitalVideoDisc disc) {
			itemsInStore.remove(disc);
			System.out.println("The disc " + disc.getTitle() + "removed");
		}

		//add
		public void addDVD(DigitalVideoDisc disc) {
		
				itemsInStore.add(disc);
				System.out.println("The disc " + disc.getTitle() + "added");
		}
		
}
