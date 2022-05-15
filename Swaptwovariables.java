public class Swaptwovariables {
    public static void main ( String [] args ) {

        String x = "water";
        String y = "pee";
        String temp = null;

        System.out.println("origin x: "+x);
        System.out.println("origin y: "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("new x: "+x);
        System.out.println("new y: "+y);
    }
}