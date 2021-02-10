package com.yihong.demo.repository;
import com.yihong.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Integer>{
}
