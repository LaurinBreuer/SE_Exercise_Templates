package de.uni.koeln.se.bookstore.controller;

import de.uni.koeln.se.bookstore.datamodel.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import de.uni.koeln.se.bookstore.service.BookService;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/bookStore")
@RestController
public class BookController {

    @Autowired
    BookService bookSer;

    @GetMapping
    public ResponseEntity<List<Book>> getAllbooks(){
        List<Book> books = new ArrayList<Book>();
        books = bookSer.findBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){

        return new ResponseEntity<>(bookSer.fetchBook(id).get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBookt(@RequestBody Book book){
        bookSer.addBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}" )
    public ResponseEntity<Book> removeBookById(@PathVariable int id){
        Book book = bookSer.fetchBook(id).get();

        if (bookSer.deleteBook(id)){
            return new ResponseEntity<>(book, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(book, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("Oldest")
    public ResponseEntity<Book> getOldestBook(){
        int id = bookSer.oldestBook();
        return new ResponseEntity<>(bookSer.fetchBook(id).get(), HttpStatus.OK);
    }

    @GetMapping("Latest")
    public ResponseEntity<Book> getLatestBook(){
        int id = bookSer.latestBook();
        return new ResponseEntity<>(bookSer.fetchBook(id).get(), HttpStatus.OK);
    }

}
