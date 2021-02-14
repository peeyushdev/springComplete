package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{

    @Autowired
    @Qualifier("circleRelated")
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
}
