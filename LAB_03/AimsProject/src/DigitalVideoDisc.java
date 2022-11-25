
public class DigitalVideoDisc {
	private static int nbDigitalVideoDisc = 0;
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
	public int id = nbDigitalVideoDisc;

    public String getTitle() {
		return title;
	}
    public void setTitle(String s)
    {
    	this.title=s;
    }
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	//kiểm tra trùng tile
	public boolean trungTitle(String title1) {
		return this.getTitle().equals(title1);
	}
	//hàm toString
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - "
				+ length + ": " + cost + "$";
	}

}
