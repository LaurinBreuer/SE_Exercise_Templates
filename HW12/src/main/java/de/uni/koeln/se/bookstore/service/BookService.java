package de.uni.koeln.se.bookstore.service;

import de.uni.koeln.se.bookstore.datamodel.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.uni.koeln.se.bookstore.repository.BookRepo;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> findBooks(){
        return bookRepo.findAll();
    }

    public Optional<Book> fetchBook(int id){
        return bookRepo.findById(id);
    }

    public Book addBook(Book book){
        return bookRepo.save(book);
    }

    public boolean deleteBook(int id){
        boolean status;
        try{
            bookRepo.deleteById(id);
            status = true;
        }catch (Exception e){
            status = false;}
            return status;

        }

        public int oldestBook(){
            List<Book> books = this.findBooks();
            int min = 2030;
            int id = 1;
            for (Book b : books){
                if(b.getDateYear()< min){
                    min = b.getDateYear();
                    id = b.getId();
                }

            }
            return id;
        }

    public int latestBook(){
        List<Book> books = this.findBooks();
        int min = 0;
        int id = 1;
        for (Book b : books){
            if(b.getDateYear()> min){
                min = b.getDateYear();
                id = b.getId();
            }

        }
        return id;
    }
}



