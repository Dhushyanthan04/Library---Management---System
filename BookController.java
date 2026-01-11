package com.library.library.controller;

import com.library.library.model.Book;
import com.library.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BookController
{
    @Autowired
    private BookService bookService;
//---------------------------------------------------------------------------
   @GetMapping("/books")
   public List<Book> getAllBooks()
   {
       return bookService.getBooks();
   }
//------------------------------------------------------------------------------
   @PostMapping("/books")
   public String addBook(@RequestBody Book book)
   {
       bookService.addBook(book);
       return "Book added succesfully";
   }
//--------------------------------------------------------------------------------------
    @DeleteMapping("/books/clear")
    public String deleteAllBooks()
    {
        bookService.deleteAllBooks();
        return "all books cleard...:)";
    }
}
