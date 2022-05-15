import java.util.*;

public class Userinput{
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = s.nextLine();
        
        System.out.println("How old are you? ");
        int age = s.nextInt();

        s.nextLine();  //因為敲擊enter時會輸入\n，而nextInt只讀取數字不讀\n，所以要清掉。

        System.out.println("What is your favorite food? ");
        String food = s.nextLine();

        System.out.println("Your name is "+name+".");
        System.out.println("Yo are "+age+" years old.");
        System.out.println("You love "+food+" the most.");

        s.close();
    }
}