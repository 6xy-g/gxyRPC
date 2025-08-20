package com.gxy;

import service.HelloService;

public class Consumer {
    public static void main(String[] args) {

        //todo
        HelloService helloService = null;
        String re = helloService.sayHello("gxy");
        System.out.println(re);
    }
}
