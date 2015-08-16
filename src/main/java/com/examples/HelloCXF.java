package com.examples;

import javax.jws.WebService;

/**
 * Created by ka40215 on 8/1/15.
 */
@WebService(endpointInterface = "com.examples.Hello", serviceName = "Hello")
public class HelloCXF implements Hello{
    public void hello(String text){
        System.out.println(text);
    }

    public void hello1(){
        System.out.println("Hello");
    }
}
