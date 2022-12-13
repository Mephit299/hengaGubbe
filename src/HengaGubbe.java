import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HengaGubbe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("giltigaOrd.txt"));
        int ord = (int) (Math.random()*101);
        String korektOrd = "";
        for (int x = 0; x<ord; x++)
           korektOrd = in.nextLine();
        String txt ="";
        int ordLenght = korektOrd.length();
        for (int x = 0; x<ordLenght; x++) txt = txt + "_";
        System.out.println(txt);
        System.out.println(ord);
        System.out.println(korektOrd);
    }
}
