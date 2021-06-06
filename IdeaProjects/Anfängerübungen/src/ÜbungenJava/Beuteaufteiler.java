package ÜbungenJava;

public class Beuteaufteiler {

    public static void main(String[]args) {

        System.out.println("Wie viele Flaschen wurden insgesammt erbeutet?");
        int bottlestotal = new java.util.Scanner(System.in).nextInt();
        int bottlescaptain=bottlestotal/2;
        int crewbottles=bottlestotal-bottlescaptain;

        System.out.println("Der Captain bekommt: "+ bottlescaptain + " Flaschen.");
        System.out.println("Die Crew bekommt: " + crewbottles + " Flaschen.");
        System.out.println("Wie groß ist die Crew?");
        int crew= new java.util.Scanner(System.in).nextInt();
        if(crewbottles%crew==0){
            System.out.println("Jeder aus der Crew bekommt "+ crewbottles/crew + " Flaschen!");
        }else {
            System.out.println("Die Flaschen können nicht gerecht aufgeteilt werden! Jeder bekommt "
                    + crewbottles/crew +
                    " und es bleiben "
                    + crewbottles%crew +
                    " Flaschen übrig!");
        }

    }
}
