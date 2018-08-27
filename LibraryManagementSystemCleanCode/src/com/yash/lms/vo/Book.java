package com.yash.lms.vo;

public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private String bookCategory;
	private int totalQuantity;
	private int availableQuantity;
	
	public Book(int bookId, String bookName, String authorName, String bookCategory,
			int totalQuantity, int availableQuantity) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookCategory = bookCategory;
		this.totalQuantity = totalQuantity;
		this.availableQuantity = availableQuantity;
	}
	
	public Book() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + availableQuantity;
		result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + totalQuantity;
		return result;
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
		if(this.bookId==other.bookId){
			return true;
		} else if(this.bookCategory!=null && this.bookCategory.equals(other.bookCategory)){
			return true;
		} else if(this.bookCategory!=null && this.bookCategory.equals(other.bookCategory) && this.bookId==other.bookId){
			return true;
		}
		return false;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	@Override
	public String toString() {
		return "BookVo [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookCategory="
				+ bookCategory + ", totalQuantity=" + totalQuantity + ", availableQuantity="
				+ availableQuantity + "]";
	}
	
}
