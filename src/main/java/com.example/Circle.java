package com.example;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

    /*
       If we comment the property set for circle bean in the xml file then
       there will be null-pointer exception
       as the center data member is not set and we are trying to call the getters on the center object
     */
    private Point center;
    public void draw(){
        System.out.println("Circle drawn with center at ("+center.getX()+","+center.getY()+")");
    }

    public Point getCenter() {
        return center;
    }

    /*
        if we use this required annotation then we spring will ensure that this object value is initiailized
        other if will throw exception
        For checking this spring provides the RequiredAnnotationBeanPostProcessor
        we need to declare the bean, once the bean is created it checks whether the required properties are set or not
        if not then throws exception
     */
    @Required
    public void setCenter(Point center) {
        this.center = center;
    }
}
