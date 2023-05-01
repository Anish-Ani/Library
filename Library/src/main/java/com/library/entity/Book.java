package com.library.entity;

import java.time.OffsetDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * Product entity.
 * This Entity Class will Create Table in Database
 */
@Entity
@Table(name="Book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String bookName;
private String authorName;
private int bookCount;
private OffsetDateTime createdDateTime;
private OffsetDateTime modifiedDateTime;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookCount() {
	return bookCount;
}
public void setBookCount(int bookCount) {
	this.bookCount = bookCount;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public OffsetDateTime getCreatedDateTime() {
	return createdDateTime;
}
public void setCreatedDateTime(OffsetDateTime createdDateTime) {
	this.createdDateTime = createdDateTime;
}
public OffsetDateTime getModifiedDateTime() {
	return modifiedDateTime;
}
public void setModifiedDateTime(OffsetDateTime modifiedDateTime) {
	this.modifiedDateTime = modifiedDateTime;
}


}
