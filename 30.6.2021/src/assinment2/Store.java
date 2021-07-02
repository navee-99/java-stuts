package assinment2;

public class Store
{
private String bookName;

public Store(String bookName) {
	super();
	this.bookName = bookName;
}



public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}



@Override
public String toString() {
	return "Store [bookName=" + bookName + "]";
}


}
