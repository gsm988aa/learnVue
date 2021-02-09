package com.siming.springboottest.repository;
import com.siming.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Integer>{
}
