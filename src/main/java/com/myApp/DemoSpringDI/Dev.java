package com.myApp.DemoSpringDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //1 Field injection
//    @Autowired
//    private Laptop laptop;

    @Autowired
    private Computer computer;

//    //2Constructor injection
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }

//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }


    //3Constructor injection

    public void build(){
        computer.comilpe();
        System.out.println("Working on awsome project");
    }
}
