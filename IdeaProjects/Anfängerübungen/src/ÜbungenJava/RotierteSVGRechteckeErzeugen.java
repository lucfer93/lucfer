package ÜbungenJava;

public class RotierteSVGRechteckeErzeugen {
    public static void main(String[]args){

        System.out.println("<svg height=\"200\" width=\"200\">");

        int x = 0;
        while(x<36){
            System.out.printf(
                    " <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"" +
                    " transform=\"rotate(" + x*10 + " 100 100)\" />\n");
            x++;
        }

        System.out.println("</svg>");

    }
}
