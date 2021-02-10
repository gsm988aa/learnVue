package com.yihong.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private String name;
    private String author;
}
