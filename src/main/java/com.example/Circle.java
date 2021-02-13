package com.example;

public class Circle implements Shape{
    private Point center;
    public void draw(){
        System.out.println("Circle drawn with center at ("+center.getY()+","+center.getY()+")");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
