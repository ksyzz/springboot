package com.example.demo.controller;

import com.example.demo.repository.AuthorRepository;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by fengqian on 2017/6/16.
 */
@RestController
public class MainController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        authorService.send();return "success";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delete(){
        Book book = bookRepository.findOne(2);
        book.getAuthors().clear();
        bookRepository.save(book);
    }


}
