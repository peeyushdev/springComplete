package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
        Point p = new Point();
        p.setX(9);
        p.setY(9);
        triangle.setPointA(p);
        //proof of by default singleton as this pointA changes will be reflected
        triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
