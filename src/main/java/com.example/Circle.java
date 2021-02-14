package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{

    @Resource(name = "pointC")
    private Point center;
    public void draw(){
        System.out.println("Circle drawn with center at ("+center.getX()+","+center.getY()+")");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    @PostConstruct
    public  void initMethod(){
        System.out.println("Init of circle");
    }

    @PreDestroy
    public  void destroyMethod(){
        System.out.println("Destroy of circle");
    }
}
