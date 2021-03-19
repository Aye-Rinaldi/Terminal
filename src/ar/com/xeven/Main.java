package ar.com.xeven;

import jdk.nashorn.internal.ir.Terminal;

/*
Implementa la clase Terminal. Un terminal tiene asociado un número. Los
terminales se pueden llamar unos a otros y el tiempo de conversación corre
para ambos.
 */
public class Main {

    public static void main(String[] args) {

        /*
        Terminall t1 = new Terminall("678 11 22 33");
        Terminall t2 = new Terminall("478 22 77 33");
        Terminall t3 = new Terminall("788 11 22 45");
        System.out.println(t1);
        System.out.println(t2);
        t1.llamar(t2,100);
        System.out.println(t1);
        t1.llamar(t3,540);
        System.out.println(t1);
        System.out.println();

         */

        Movil movil1 = new Movil("678 11 22 33","rata");
        Movil movil2 = new Movil("478 22 77 33","mono");
        Movil movil3 = new Movil("788 11 22 45","bisonte");
        System.out.println(movil1);
        System.out.println(movil2);
        movil1.llamar(movil2,370);
        movil1.llamar(movil3,500);
        movil2.llamar(movil3,400);
        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(movil3);
        movil3.llamar(movil1,200);
        System.out.println(movil3);





    }
}
