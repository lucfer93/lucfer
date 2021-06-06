package ÜbungenJava;


import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[]args){

        double zahl1, zahl2, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Zahl 1 eingeben: ");
        zahl1=input.nextDouble();

        System.out.println("Bitte Operator eingeben: ");
        operator=input.next().charAt(0);

        System.out.println("Bitte Zahl 2 eingeben: ");
        zahl2=input.nextDouble();


        switch(operator) {
            case '+':
                result=zahl1+zahl2;
                System.out.println(zahl1 + " + " + zahl2 + " = " + result);
                break;
            case '-':
                result=zahl1-zahl2;
                System.out.println(zahl1 + " - " + zahl2 + " = " + result);
                break;
            case '*':
                result=zahl1*zahl2;
                System.out.println(zahl1 + " * " + zahl2 + " = " + result);
                break;
            case '/':
                result=zahl1/zahl2;
                System.out.println(zahl1 + " / " + zahl2 + " = " + result);
                break;
            default:
                System.out.println("Irjendwas stimmt hier nich Kollege");

        }

    }
}
