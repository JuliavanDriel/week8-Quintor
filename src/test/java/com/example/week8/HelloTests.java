package com.example.week8;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class HelloTests {
    @Autowired Hello hello;
    @Test
    public void testsHello(){
        String message = hello.sayHello();
        Assert.assertEquals("Hello, world!", message);
    }
}
