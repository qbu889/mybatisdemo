package com.example.demo.Controller;

import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/1
 */
//@Controller

@RestController
public class BookController {
    //    @ResponseBody
    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }

    //防止中文乱码
//    @RequestMapping(value = "/book",produces = "application/json;charset=utf-8")
    @GetMapping("/book")
    public Book book() {
        Book book =new Book();
        book.setId(1);
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }


    @GetMapping("/book2")
    @ResponseBody
    public String book3(@ModelAttribute("b") Book bk,@ModelAttribute("a") User user) {
        return bk.toString() + ">>" + user.toString();
    }
}
