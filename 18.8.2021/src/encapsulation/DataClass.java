package encapsulation;

public class DataClass {
 private String name;
 private int Id;
 private String place;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public DataClass(String name, int id, String place) {
	super();
	this.name = name;
	Id = id;
	this.place = place;
}
public DataClass() {
	// TODO Auto-generated constructor stub
}

 
}
