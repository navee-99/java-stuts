package assesmentOne;

public class Author {
	private int authorid;
	private String name;
	public Author() {
		super();
	}
	
	public Author(int authorid, String name) {
		super();
		this.authorid = authorid;
		this.name = name;
	}

	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}