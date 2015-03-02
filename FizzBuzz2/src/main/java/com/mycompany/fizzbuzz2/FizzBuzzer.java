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
        if (Integer.toString(number).contains("7") || number % 7 == 0) {
            message += "Wizz";
        }

        if (Integer.toString(number).contains("3")) {
            message += "Fizz";
        }

        if (Integer.toString(number).contains("5")) {
            message += "Buzz";
        }
        if (message.isEmpty()) {
            message+=number;
        }
        return message;
    }
}
