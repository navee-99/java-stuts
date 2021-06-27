package assesmentOne;

public class Book {
	private int sno;
	private String name;
	private int price;
	private int authorid;
	private int pages;
	public Book(int sno, String name, int price, int authorid, int pages) {
		super();
		this.sno = sno;
		this.name = name;
		this.price = price;
		this.authorid = authorid;
		this.pages = pages;
	}
	public Book() {}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	

}