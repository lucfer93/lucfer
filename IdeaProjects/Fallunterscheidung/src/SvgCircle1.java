import java.sql.SQLOutput;

public class SvgCircle1 {

    public static void main(String[] args) {
        System.out.println("Bitte X-Wert angeben: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Bitte Y-Wert angeben: ");
        int y = new java.util.Scanner(System.in).nextInt();
        double r = 20+(Math.random()*(50-20));

        System.out.println("<svg height=\"100\" width=\"1000\">\n"
                + "circle cx=\"" + x + "\" cy=\"" + y +"\" r=\"" + r + "\" />\n"
                + "</svg>");

    }



}
