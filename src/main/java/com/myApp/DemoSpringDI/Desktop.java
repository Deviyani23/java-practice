package com.myApp.DemoSpringDI;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void comilpe(){
        System.out.println("Buy a Desktop");
    }
}
