package com.example;


public class Triangle implements Shape{

    Point pointA;
    Point pointB;
    Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    public void draw() {
        System.out.println("PointA = ("+getPointA().getX()+","+pointA.getY()+")");
        System.out.println("PointB = ("+getPointB().getX()+","+pointB.getY()+")");
        System.out.println("PointC = ("+getPointC().getX()+","+pointC.getY()+")");
    }
}
