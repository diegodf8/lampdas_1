package com.cice.lambda;

import com.cice.lambda.interfaces.IFuncional1;
import com.cice.lambda.interfaces.ImpIFuncional1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        IFuncional1<Integer,Integer, Integer> if1 = new ImpIFuncional1();
        int suma = if1.test(1, 5);

        IFuncional1<Integer,Integer, Integer> if2 = (a, b) -> (a / b);
        int calculo = if2.test(10, 4);
        System.out.println(calculo);

        IFuncional1<Integer,Integer, Integer> if3 = (a, b) -> {
            int l = a + b;
            System.out.println(l);
            return l;
        };

        if3.test(4, 7);


        List<String> nombres = new ArrayList<>();
        nombres.add("pepe");
        nombres.add("luis");
        nombres.add("yako");

        Long count = nombres.stream().filter(s -> s.equals("luiss")).count();
        System.out.println("____" + count);

        nombres.forEach(t  -> System.out.println("Elemento: " + t));


        }
    }


