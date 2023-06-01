package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(4));
        System.out.println(fizzBuzz(3));
    }

    public static String fizzBuzz(int number) {
        String result= "";
        if(number%3 == 0)
            result += "fizz";
        if(number%5 == 0)
            result += "buzz";
        if(!(number%3 == 0) && !(number%5 ==0))
            result += number;
        return result;
    }
}