import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HengaGubbe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("giltigaOrd.txt"));
        int ord = (int) (Math.random()*101);
        String[] ordet = new String[ord];
        for (int x=1;x<ord; x++)
            ordet[x]= in.nextLine();
        String rättOrd = ordet[ord];
        String txt ="";
        int ordlängd = rättOrd.length();
        for (int x= 1; x<ordlängd; x++)
            txt = txt + "_";

    }
}
