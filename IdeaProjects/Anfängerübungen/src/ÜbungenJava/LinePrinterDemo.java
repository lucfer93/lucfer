package ÜbungenJava;

import java.util.Scanner;

public class LinePrinterDemo {

    public static void main(String[]args){


        int len = new java.util.Scanner(System.in).nextInt();


        Line3.line(len);
        System.out.println();
        Line3.line(len,'c');
        System.out.println();
        Line3.line("{", len, '=', "]" );
        System.out.println();
        Line3.line(len, "+-=");

        // Entweder oder ^v

        /*System.out.println("Wie viele Reihen möchtest du angezeigt bekommen?");
        int x = new java.util.Scanner(System.in).nextInt();

        for(int i = 0; i<x; i++)
        {
        LinePrinter.line();
        System.out.println();
        LinePrinter2.line2();
        System.out.println();
        }*/

    }

}
