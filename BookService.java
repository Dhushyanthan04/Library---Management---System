package com.library.library.service;

import com.library.library.model.Book;
import com.library.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepo;
//----------------------------------------------------------------------------------
    public List<Book> getBooks()
    {
        return bookRepo.findAll();
    }
//----------------------------------------------------
    public void addBook(Book book)
    {
        bookRepo.save(book);
    }
//------------------------------------------------------------
    //delete...........
    public void deleteAllBooks()
    {
        bookRepo.deleteAll();
    }
}
