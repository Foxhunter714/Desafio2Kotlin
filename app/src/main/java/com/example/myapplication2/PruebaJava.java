package com.example.myapplication2;

class PruebaJava {

    public void saludo(){
        System.out.println("Hola a todos desde Java");

        PruebaKotlin pruebaKotlin = new PruebaKotlin();
        int result = pruebaKotlin.suma2();

        System.out.println("Resultado desde Kotlin");
        System.out.println(result);
    }

}
