package com.example.demo;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import com.example.demo.util.Mailer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	BookRepository bookRepository;
	@Test
	public void contextLoads() {
	}

	@Test
	public void create(){
//		Author author = authorRepository.findOne(1);
//		Mailer.send(author);
	}
//		Book book = bookRepository.findOne(5);
//		List<Author> authors = new ArrayList<>();
////		for (int i=1;i<3;i++){
////			Author author = new Author();
////			authors.add(author);
////		}
//		book.getAuthors().clear();
//		book.setAuthors(authorRepository.findAll());
//		bookRepository.save(book);
//	}


}
