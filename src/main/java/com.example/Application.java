package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
    public static void main(String[] args) {
//        MyShape myShape = new MyShape();
//        myShape.setShape(new Circle());
//        myShape.draw();
//        myShape.setShape(new Circle());
//        myShape.draw();

//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
//        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
//        triangle.draw();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
