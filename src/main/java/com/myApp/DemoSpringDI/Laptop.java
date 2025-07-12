package com.myApp.DemoSpringDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{
    public void comilpe(){
        System.out.println("Buy a laptop");
    }


}
