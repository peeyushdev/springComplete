package com.example;

//become loosely coupled with dependency Shape
public class MyShape {
    Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public void draw(){
        this.shape.draw();
    }
}
