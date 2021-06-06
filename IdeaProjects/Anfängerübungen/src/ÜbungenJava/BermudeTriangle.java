package ÜbungenJava;
import java.awt.*;

public class BermudeTriangle {

    public static void main( String[] args ) {
        Polygon bermuda = new Polygon();

        bermuda.addPoint(20,9);
        bermuda.addPoint(40,30);
        bermuda.addPoint(16,49);

        System.out.println(bermuda.contains(20,));

        final int Dimension = 50;
        final String Okto = "\uD83D\uDC19";
        final String Regen = "\uD83C\uDF08";

        for(int y = 0; y<50; y++){
            for(int x = 0; x<50; x++){
                System.out.print(bermuda.contains(x,y) ? Okto : Regen);
            }
            System.out.println();

        }
        }
    }

