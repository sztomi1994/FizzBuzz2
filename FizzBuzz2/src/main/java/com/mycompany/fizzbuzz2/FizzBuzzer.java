/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz2;

/**
 *
 * @author Toooooomi
 */
public class FizzBuzzer {
    public String execute(int number) {
    String message = "";
    if (number%7==0){
     message += "Wizz";
    }
    
     if (Integer.toString(number).contains("3")) {
            message += "Fizz";
        }
    
    return message;
    }
}
