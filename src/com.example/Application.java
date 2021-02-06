package com.example;

public class Application {
    public static void main(String[] args) {
       Shape shape = new Circle();
       shape.draw();
       shape = new Triangle();
       shape.draw();
    }
}
