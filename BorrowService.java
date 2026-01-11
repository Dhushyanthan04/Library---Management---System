package com.library.library.service;

import com.library.library.model.Book;
import com.library.library.model.Borrow;
import com.library.library.repository.BookRepository;
import com.library.library.repository.BorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class BorrowService
{
    @Autowired
    private BookRepository bookRepo;
    @Autowired
    private BorrowRepository borrowRepo;
//------------------------------------------------------------------------------
    public Borrow borrowBook(Long userId, Long bookId)
    {
        //1. Get book from DB
        Book book = bookRepo.findById(bookId).orElseThrow();

        //2. check availability
        if(book.getAvailableCopies()==0)
        {
            throw new RuntimeException("Book not available.!!");
        }

        //3.reduce copy count
        book.setAvailableCopies(book.getAvailableCopies()-1);
        bookRepo.save(book);

        //4. create----------------------->borrow "record".......
        Borrow borrow =new Borrow();
        borrow.setUserId(userId);
        borrow.setBookId(bookId);
        borrow.setBorrowDate(LocalDate.now());
        borrow.setStatus("BORROWED..!!!");

        //5.save borrw details in DB.....
        return borrowRepo.save(borrow);

    }
//--------------------------------------------------------------------------
     //@delete...........
    public void clearBorrow()
    {
        borrowRepo.deleteAll();
    }
}
