package com.example;

import org.javamoney.moneta.Money;

public class App
{
    public static void main( String[] args )
    {
        Money money = Money.of(100, "USD");
        System.out.println( "Hello World! I have money: " + money);
    }
}
