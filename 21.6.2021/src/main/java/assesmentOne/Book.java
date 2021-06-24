package assesmentOne;

public class Book {
	private int sno;
	   private String bookname;
	   private int Pages;
	   private int AuthorID;
	   private int Price;
	   
	   public Book() {}
	public Book(int sno, String bookname, int AuthorID,int Pages,int Price) {
		super();
		this.setsno(sno);
		this.setbookname(bookname);
		this.setAuthorID(AuthorID);
		this.setPages(Pages);
		this.setPrice(Price);
	}
	public int getsno() {
		return sno;
	}
	public void setsno(int sno) {
		this.sno = sno;
	}
	public String getbookname() {
		return bookname;
	}
	public void setbookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int Pages) {
		this.Pages = Pages;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int AuthorID) {
		this.AuthorID = AuthorID;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	   
	}

