package ÜbungenJava;

public class RightTriangle {

    public static void main(String[] args) {
        System.out.println("Bitte X-Wert eingeben!");
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Bitte Y-Wert eingeben!");
        double y = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Bitte Z-Wert eingeben!");
        double z = new java.util.Scanner(System.in).nextDouble();
        System.out.println(isRightTriangle( x,  y,  z));

    }

        public static boolean isRightTriangle ( double x, double y, double z){
                boolean result =         Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) ||
                                         Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2) ||
                                         Math.pow(z, 2) + Math.pow(y, 2) == Math.pow(x, 2);
                return result;
            }


        }


