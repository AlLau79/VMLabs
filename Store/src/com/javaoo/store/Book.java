package com.javaoo.store;

public class Book extends Item{
	private String author;
	private String publisher;
	private String category;
	
	public Book(String title, double price, int quantity, String author, String publister, String category){
		super(title, price, quantity);
		this.setAuthor(author);
		this.setCategory(category);
		this.setPublisher(publister);
	}
	
	
	/**
	 * @return the author
	 */
	public final String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public final void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the publisher
	 */
	public final String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public final void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the category
	 */
	public final String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public final void setCategory(String category) {
		this.category = category;
	}
	
	
}
