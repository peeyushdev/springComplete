package com.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Circle implements Shape{

    @Resource(name = "pointC")
    private Point center;
    @Autowired
    private ResourceBundleMessageSource messageSource;
    public void draw(){
        System.out.println(messageSource.getMessage("drawing.circle",null,null));
        System.out.println(messageSource.getMessage("drawing.center",new Object[]{center.getX(),center.getX()},null));

//        System.out.println("Circle drawn with center at ("+center.getX()+","+center.getY()+")");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
