package com.example;

public class Application {
    public static void main(String[] args) {
        MyShape myShape = new MyShape();
        myShape.setShape(new Circle());
        myShape.draw();
        myShape.setShape(new Circle());
        myShape.draw();
    }
}
