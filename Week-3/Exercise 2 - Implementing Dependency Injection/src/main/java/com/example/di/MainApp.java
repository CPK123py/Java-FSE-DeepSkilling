package com.example.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
        Car car = context.getBean(Car.class);
        car.drive();
        context.close();
    }
}
