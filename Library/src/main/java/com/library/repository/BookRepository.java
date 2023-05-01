package com.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.library.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	 @Query("FROM Book book WHERE book.bookName =:bookName AND book.authorName =:authorName")
	   List<Book> findByBookAndAuthorName(@Param("bookName") String bookName,@Param("authorName")String authorName);

}
