package com.company;

public class Main {

    public static void main(String[] args) {

        int result = suma(3, 2,1);
        System.out.println(result);

        Coche micoche = new Coche();
        micoche.sumarPuerta();
        System.out.println(micoche.numPuerta);
    }
    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}
class Coche{
    public int numPuerta = 0;
    public void sumarPuerta(){
        this.numPuerta++;
    }
}
