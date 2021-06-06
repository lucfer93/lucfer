package ÜbungenJava;

public class Calculator {


        public static int add ( int zahl1, int zahl2){
            return zahl1 + zahl2;
        }

        public static int sub ( int zahl1, int zahl2){
            return zahl1 - zahl2;
        }

        public static int mul ( int zahl1, int zahl2){
            return zahl1 * zahl2;
        }

        public static double div ( int zahl1, int zahl2){
            if (zahl2 == 0) {
                return 0;
            } else {
                return zahl1 / zahl2;
            }
        }

    }


