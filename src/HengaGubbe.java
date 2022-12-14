import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HengaGubbe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("giltigaOrd.txt"));
        int ord = (int) (Math.random()*101);
        String ordet = "";
        for (int x = 0; x<ord; x++)
           ordet = in.nextLine();
        String txt ="";
        System.out.println(ord);
        System.out.println(ordet);
        int ordLenght = ordet.length();
        for (int x = 0; x<ordLenght; x++)
            txt = txt + "_";
        while (true) {
            String gissning = JOptionPane.showInputDialog("Gissning " +txt);
            String svar = Levi.title(ordet, gissning, txt);
            System.out.println(svar);
            System.out.println(txt);
            if (svar.equals("false")){}
            else
                txt = svar;
            if (txt.toLowerCase().equals(ordet)){
                System.out.println("rätt");
                System.exit(0);
            }


        }
    }
}
