package com.example;

public class Triangle implements Shape{
    String type;
    int height;

    public Triangle(int height) {
        this.height = height;
    }
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }


    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    //    public void setType(String type) {
//        this.type = type;
//    }


    public void draw(){
        System.out.println(getType()+ " Triangle is drawn of height "+getHeight());

    }
}
