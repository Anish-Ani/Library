package com.library.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dto.request.BookRequest;
import com.library.dto.request.UpdateBookRequest;
import com.library.entity.Book;
import com.library.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	
@Autowired
private BookRepository repo;
	@Override
	public void add(BookRequest bookRequest) {
		Book book=new Book();
		book.setBookName(bookRequest.getBookName());
		book.setAuthorName(bookRequest.getAuthorName());
		book.setBookCount(bookRequest.getBookCount());
		book.setCreatedDateTime(OffsetDateTime.now());
		repo.save(book);	
	}
	@Override
	public void update(UpdateBookRequest updateBookRequest) {
	
		Optional<Book> book=repo.findById(updateBookRequest.getId());
		if(book.isPresent())
		{
			Book bookData=book.get();
			bookData.setAuthorName(updateBookRequest.getAuthorName());
			bookData.setBookName(updateBookRequest.getBookName());
			bookData.setBookCount(updateBookRequest.getBookCount());
			bookData.setModifiedDateTime(OffsetDateTime.now());
			repo.save(bookData);
			
		}
		
	}
	@Override
	public void deleteBook(long id) {
		repo.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Book> getBookList() {
		List<Book> bookList=(List<Book>) repo.findAll();
		// TODO Auto-generated method stub
		return bookList;
	}

}
