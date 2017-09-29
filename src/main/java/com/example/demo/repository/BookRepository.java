package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by fengqian on 2017/6/16.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
}
