package com.fexco.lambda;

/**
 * Created by dobrien1 on 14/07/2017.
 */
public class Greeter {

    public void greet(){
        System.out.println("Hello World");
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        greeter.greet();

    }

}
