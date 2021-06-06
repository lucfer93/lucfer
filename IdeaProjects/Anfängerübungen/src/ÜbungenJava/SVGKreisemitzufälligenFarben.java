package ÜbungenJava;

import java.util.Random;

public class SVGKreisemitzufälligenFarben {

    public static void main(String[]args){

        final String[] farben = {"grün", "blau", "gelb", "violett", "schwarz"};
        Random random = new Random();
        int index = random.nextInt(farben.length);
        System.out.println(farben[index]);

    }
}
