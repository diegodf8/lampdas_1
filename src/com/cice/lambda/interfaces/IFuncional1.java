package com.cice.lambda.interfaces;

public interface IFuncional1<T, V, W> {
    /**
     * Unico metodo abstracto del interfaz
     * T es el tipo de entrada y V el tipo de salida
     * deben ser clases las letras mayusculas
     * @param a
     * @param b
     * @return
     */
    V test(T a, W b);


}
