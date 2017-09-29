package com.example.demo.util;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import com.example.demo.service.ServiceFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MailSender extends Thread {
    private Author author;

    @Override
    public void run() {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        String name = author.getName();
        List<Future<String>> names = new ArrayList<>();
        for (int i = 1; i<=100; i++){
            Mailer mailer = new Mailer();
            mailer.setAd(String.valueOf(i));
            mailer.setAuthor(author);
            names.add(exec.submit(mailer));
        }

        for (Future<String> fs : names){
            try {
                name += fs.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        AuthorService authorService = (AuthorService) ServiceFactory.getSpringBean("authorService");
        author.setName(name);
        authorService.save(author);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
