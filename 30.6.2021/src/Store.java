package assinment2;

public class Store
{
private String bookName;
private String bookName1;

public String getBookName1() {
	return bookName1;
}



public void setBookName1(String bookName1) {
	this.bookName1 = bookName1;
}



public Store(String bookName ,String bookName1) {
	super();
	this.bookName = bookName;
	this.bookName1=bookName1;
}



public Store() {
	// TODO Auto-generated constructor stub
}




	// TODO Auto-generated constructor stub




public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}



@Override
public String toString() {
	return "Store [bookName=" + bookName + ", bookName1=" + bookName1 + "]";
}


}
