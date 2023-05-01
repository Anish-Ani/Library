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
/**
 * Product service implement.
 */
@Service
public class BookServiceImpl implements BookService {
	
@Autowired
private BookRepository repo;

/**
 * This method is used to add book in MySQL Database
 * @param BookRequest It Contain Book details to be Added.
 * @return void
 */
	@Override
	public void add(BookRequest bookRequest) {
		Book book=new Book();
		book.setBookName(bookRequest.getBookName());
		book.setAuthorName(bookRequest.getAuthorName());
		book.setBookCount(bookRequest.getBookCount());
		book.setCreatedDateTime(OffsetDateTime.now());
		repo.save(book);	
	}

/**
 * This method is used to Update book in MySQL Database
 * @param UpdateBookRequest It Contain Book details to be Updated.
 * @return void
 */
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
	/**
	 * This method is used to Delete book in MySQL Database
	 * @param Id It Contain Book Id to be Deleted.
	 * @return void
	 */
	@Override
	public void deleteBook(long id) {
		repo.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	/**
	 * This method is used to Update book in MySQL Database
	 * @return List<Book> return list book in the DataBase
	 */
	@Override
	public List<Book> getBookList() {
		List<Book> bookList=(List<Book>) repo.findAll();
		// TODO Auto-generated method stub
		return bookList;
	}
	
	public boolean isBookExists(String bookName,String authorName)
	{
		List<Book>bookList=repo.findByBookAndAuthorName(bookName, authorName);
		if(bookList.size()>0)
		{
			return true;
		}
		return false;
	}

}
