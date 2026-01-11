package com.library.library.controller;

import com.library.library.model.Borrow;
import com.library.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BorrowController
{
   @Autowired
    private BorrowService borrowService;
//--------------------------------------------------------------------------
    @PostMapping("/borrow")
    public Borrow borrowBook(@RequestParam Long userId,@RequestParam Long bookId)
    {
        return borrowService.borrowBook(userId,bookId);
    }
//----------------------------------------------------------------------------
    @DeleteMapping("/borrow/clear")
    public String clearBorrow()
    {
        borrowService.clearBorrow();
        return "Borrow Records Cleared...!!";
    }
}
