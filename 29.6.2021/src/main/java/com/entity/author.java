package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class author {
  @Id
   private Integer authorid;
  @Column
   private String name;

  @OneToMany(mappedBy = "author",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   private Set<Book> books;
  @Override
public String toString() {
	return "author [authorid=" + authorid + ", name=" + name + ", books=" + books + "]";
}
public Set<Book> getBooks() {
	return books;
}
public void setBooks(Set<Book> books) {
	this.books = books;
}
public author() {}
  public author(Integer authorid,String name) {
	  this.authorid=authorid;
	  this.name=name;
  }
public Integer getAuthorid() {
	return authorid;
}
public void setAuthorid(Integer authorid) {
	this.authorid = authorid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
