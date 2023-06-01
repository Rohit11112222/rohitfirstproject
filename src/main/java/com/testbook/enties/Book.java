package com.testbook.enties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String Name;
   private String Title;
public Book(int id, String name, String title) {
	super();
	this.id = id;
	Name = name;
	Title = title;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}


   

}
