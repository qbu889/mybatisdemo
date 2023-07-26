package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/11/30
 */
@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Float price;
    private Date publicationDate;

    //---若是没有使用GSON需要按如下格式进行---
//    @JsonIgnore
//    private Float price;
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    private Date publicationDate;
    //------
}
