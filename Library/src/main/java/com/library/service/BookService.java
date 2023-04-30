package com.library.service;

import java.util.List;

import com.library.dto.request.BookRequest;
import com.library.dto.request.UpdateBookRequest;
import com.library.entity.Book;

public interface BookService {
	
	public void add(BookRequest bookRequest );
	
	public void update(UpdateBookRequest updateBookRequest );
	
	public void deleteBook(long id );
	
	public List<Book> getBookList();

}
