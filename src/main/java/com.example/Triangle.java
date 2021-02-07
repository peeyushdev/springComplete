package com.example;

public class Triangle implements Shape{
//    String type;
//    int height;
//
//    public Triangle(int height) {
//        this.height = height;
//    }
//    public Triangle(String type) {
//        this.type = type;
//    }
//
//    public Triangle(String type, int height) {
//        this.type = type;
//        this.height = height;
//    }
//
//
//    public String getType() {
//        return type;
//    }
//
//    public int getHeight() {
//        return height;
//    }

//        public void setType(String type) {
//        this.type = type;
//    }


    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
//        System.out.println(getType()+ " Triangle is drawn of height "+getHeight());
        System.out.println("PointA = ("+getPointA().getX()+","+pointA.getY()+")");
        System.out.println("PointB = ("+getPointB().getX()+","+pointB.getY()+")");
        System.out.println("PointC = ("+getPointC().getX()+","+pointC.getY()+")");
    }
}
