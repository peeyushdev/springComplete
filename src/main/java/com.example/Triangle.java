package com.example;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape {

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


//    public void destroy() throws Exception {
//        System.out.println("DisposableBean destroy called on triangle");
//    }
//
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("InitializingBean init called on triangle");
//    }


    public void myInit(){
        System.out.println("myInit called on triangle");
    }
    public void myDestroy(){
        System.out.println("myDestroy called on triangle");
    }
}
