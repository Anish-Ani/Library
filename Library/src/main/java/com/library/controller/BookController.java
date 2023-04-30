package com.library.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.dto.request.BookRequest;
import com.library.dto.request.UpdateBookRequest;
import com.library.entity.Book;
import com.library.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;
	
	@PostMapping("/add/book")
	public String addBook(@RequestBody BookRequest bookRequest)
	{
		bookservice.add(bookRequest);
		
		return "Book Added Sucessfully";
	}
	@PutMapping("/update/book")
	public String updateBook(@RequestBody UpdateBookRequest updateBookRequest)
	{
		bookservice.update(updateBookRequest);
		
		return "Book Updated Sucessfully";
	}
	@DeleteMapping("/delete/book")
	public String deleteBook(@RequestParam(value="id") Long id)
	{
		bookservice.deleteBook(id);
		
		return "Book Deleted Sucessfully";
	}
	@GetMapping("/get/book")
	public List<Book> getBook()
	{	
		return 	bookservice.getBookList();
	}
	
}
