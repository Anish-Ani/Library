package com.library.dto.request;

public class BookRequest {
private String bookName;
private String authorName;
private int bookCount;
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
public int getBookCount() {
	return bookCount;
}
public void setBookCount(int bookCount) {
	this.bookCount = bookCount;
}


}
