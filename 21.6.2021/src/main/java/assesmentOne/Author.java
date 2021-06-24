package assesmentOne;

public class Author {
	private int AuthorID;
	   private String name;
	   private int sno;
	 
	   
	   public Author() {}
		public Author(int AuthorID, String name) {
			super();
			this.setAuthorID(AuthorID);
			this.setName(name);
}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAuthorID() {
			return AuthorID;
		}
		public void setAuthorID(int AuthorID) {
			this.AuthorID = AuthorID;
			
		}
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		
}