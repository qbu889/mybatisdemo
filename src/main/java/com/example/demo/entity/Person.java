package com.example.demo.entity;

import lombok.Data;

/**
 * Demo class
 *
 * @author nol
 * @date 2023/2/16
 */
@Data
public class Person {
    //    List<testStream.Person> personList = new ArrayList<testStream.Person>();
//            personList.add(new Person("Tom", 8900,18, "male", "New York"));
//            personList.add(new Person("Jack", 7000,19, "male", "Washington"));
//            personList.add(new Person("Lily", 7800,20, "female", "Washington"));
//            personList.add(new Person("Anni", 8200,21, "female", "New York"));
//            personList.add(new Person("Owen", 9500,22, "male", "New York"));
//            personList.add(new Person("Alisa", 7900,23, "female", "New York"));
//            System.out.println(personList);
    private String name; // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area; // 地区

    // 构造方法
    public Person(String name, int salary, int age, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.area = area;
    }
}
