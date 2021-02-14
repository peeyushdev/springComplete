package com.example;



import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
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
}
