package com.example.demo.util;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import com.example.demo.service.ServiceFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

import static java.lang.Thread.sleep;


public class Mailer implements Callable<String> {
    private String ad;
    private Author author;
    public static void send(Author author){
//        ExecutorService exec = Executors.newFixedThreadPool(10);
//        String name = author.getName();
//        List<Future<String>> names = new ArrayList<>();
//        for (int i = 1; i<=100; i++){
//            Mailer mailer = new Mailer();
//            mailer.setAd(String.valueOf(i));
//            mailer.setAuthor(author);
//            names.add(exec.submit(mailer));
//        }
//
//        for (Future<String> fs : names){
//            try {
//                name += fs.get();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//        AuthorService authorService = (AuthorService) ServiceFactory.getSpringBean("authorService");
//        author.setName(name);
//        authorService.save(author);
    }

    @Override
    public String call() {
        String name = ad;

        try {
            sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ad);
        return name;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
