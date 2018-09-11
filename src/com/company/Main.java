package com.company;
import java.io.*;
import java.util.*;

class Test {

    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Welcome the Limsane Calculator!");
        System.out.println("What would like to do (+, -, *, /)?");
        String operator = kbInput.next();

        do {
            if (operator != "+" || operator != "-" || operator != "*" || operator != "/");
            {
                System.out.println("That is not an operator! Pick either add, subtract, multiply, or divide");
            }
        } while (operator != "+" || operator != "-" || operator != "*" || operator != "/");

        if (operator == "+") {
            operator = "add";
        }
            System.out.println("What would like to " + operator + " together? Pick one number and press enter, then pick another number and press enter again.");
        }

    }
}
