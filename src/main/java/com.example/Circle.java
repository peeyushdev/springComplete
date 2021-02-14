package com.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

    @Resource(name = "pointC")
    private Point center;
    @Autowired
    private ResourceBundleMessageSource messageSource;

    private ApplicationEventPublisher publisher;
    public void draw(){
        System.out.println(messageSource.getMessage("drawing.circle",null,null));
        System.out.println(messageSource.getMessage("drawing.center",new Object[]{center.getX(),center.getX()},null));
        MyEvent event= new MyEvent(this);
        publisher.publishEvent(event);

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
    }
}
