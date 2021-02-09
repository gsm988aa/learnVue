package com.siming.springboottest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
}
