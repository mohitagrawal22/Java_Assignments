package com.masaiQ1;

public class Book {

	private int isbn;
	private String bookName;
	private String author;
	
	 public Book() {

	    }
	    public Book(int isbn,String bookName,String author ) {
	        super();
	        this.isbn=isbn;
	        this.bookName=bookName;
	        this.author=author;
	        
	    }
	    
	   
	    public void setisbn(String isbn) {
	        this.isbn = isbn;
	    }
	    public String getisbn() {
	        return isbn;
	    }
	 
	
	
}
