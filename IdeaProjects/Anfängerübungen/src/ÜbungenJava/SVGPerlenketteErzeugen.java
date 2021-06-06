package ÜbungenJava;

import java.util.Random;

public class SVGPerlenketteErzeugen {

    public static void main(String[]args){

        int perlenanzahl = 0;
        System.out.println("<svg height=\"100\" width=\"1000\">");

        while(perlenanzahl<50){
            final String [] perlen = {
                    "<circle cx=\""+ (20+(perlenanzahl*10)) +"\" cy=\"20\" r=\"5\" fill=\"blue\" />",
                    "<circle cx=\""+ (20+(perlenanzahl*10)) +"\" cy=\"20\" r=\"5\" fill=\"green\" />",
                    "<circle cx=\""+ (20+(perlenanzahl*10)) +"\" cy=\"20\" r=\"5\" fill=\"orange\" />"};
            Random random = new Random();
            int index = random.nextInt(perlen.length);
            System.out.println(perlen[index]);
            perlenanzahl++;
        }

        System.out.println("</svg>");

    }
}
