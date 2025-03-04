package com.mps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Book{
	private int id;
	private String name;
	private String author;
	public Book() {
		
	}
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name);
	}
	
}
public class Exp4 {

	public static void main(String args[]) {
		Map<String,List<Book>> bookData = new HashMap<>();
		List<Book> bdata1 = new ArrayList<>();
		bdata1.add(new Book(101,"Core Java", "james"));
		bdata1.add(new Book(102,"Adv Java", "sri"));
		List<Book> bdata2 = new ArrayList<>();
		bdata2.add(new Book(201,"Spring", "Rodj"));
		bdata2.add(new Book(202,"Microservices", "Kohli"));
		List<Book> bdata3 = new ArrayList<>();
		bdata3.add(new Book(301,"ECE", "king"));
		bdata3.add(new Book(302,"DE", "rohit"));
		bookData.put("Software",bdata1);
		bookData.put("Frameworks",bdata2);
		bookData.put("ECEDept",bdata3);
		Iterator<Entry<String,List<Book>>> itr = bookData.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,List<Book>> et = itr.next();
			System.out.println("Department : "+et.getKey());
			for(Book bd : et.getValue()) {
				System.out.println(bd.getId()+" "+bd.getName()+" "+bd.getAuthor());
			}
		}
		bookData.forEach((k,v)->System.out.println(k+" "+v));
	}
}
