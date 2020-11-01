package com.cybertek;

import com.cybertek.config.AppConfig;
import com.cybertek.interfaces.Calculator;
import com.cybertek.interfaces.price.State;
import com.cybertek.services.calculator.TotalPrice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
      //  State state= container.getBean("texas", State.class);
      //  State state1 = container.getBean("va",State.class);
        Calculator calculator = container.getBean("totalPrice", Calculator.class);

        calculator.totalPrice();

        ((AnnotationConfigApplicationContext) container).close();
    }
}