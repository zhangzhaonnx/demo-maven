package com.example;

import org.javamoney.moneta.Money;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<String> textList = new ArrayList();
        Money money = Money.of(100, "USD");
        System.out.println( "Hello World! I have money: " + money);
    }
}
