package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void number_isNotFizzorBuzz(){
        int a = 4;
        Assertions.assertEquals(a, Integer.parseInt(Main.fizzBuzz(a)));
    }
    @Test
    void number_isFizzNotBuzz(){
        int a = 3;
        Assertions.assertEquals("fizz", Main.fizzBuzz(a));
    }
    @Test
    void number_isBuzzNotFizz(){
        int a = 5;
        Assertions.assertEquals("buzz", Main.fizzBuzz(a));
    }
    @Test
    void number_isFizzBuzz(){
        int a = 15;
        Assertions.assertEquals("fizzbuzz", Main.fizzBuzz(a));
    }
}
