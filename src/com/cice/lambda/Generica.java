package com.cice.lambda;

import java.io.Serializable;

public class Generica<T> implements Serializable{

    public Generica() {
    }

    void prueba (T t){
        System.out.println(t.getClass().getCanonicalName());
        if (t instanceof String){
            ((String) t).length();
        }else if (t instanceof Integer){
            t.toString();
        }else if (t instanceof  Double){
            t.toString();
        }
    }
}
