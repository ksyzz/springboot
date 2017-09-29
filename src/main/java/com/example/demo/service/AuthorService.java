package com.example.demo.service;

import com.example.demo.entity.Author;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.util.MailSender;
import com.example.demo.util.Mailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public void save(Author author){
        authorRepository.save(author);
    }

    public void send(){
        Author author = authorRepository.findOne(1);
        MailSender mailSender = new MailSender();
        mailSender.setAuthor(author);
        mailSender.run();
    }
}
