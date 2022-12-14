import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HengaGubbe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inList = new Scanner(new File("giltigaOrd.txt"));
        Scanner inGissning = new Scanner(System.in);
        int ord = (int) (Math.random()*101);
        String ordet = "";
        for (int x = 0; x<ord; x++)
           ordet = inList.nextLine();
        String txt ="";
        int ordLenght = ordet.length();
        for (int x = 0; x<ordLenght; x++)
            txt = txt + "_";
        System.out.println(ord);
        while (true) {
            System.out.println("Gissning " + txt);
            String gissning = inGissning.nextLine();
            String svar = Levi.title(ordet, gissning, txt);
            if (svar.equals("false")){}
            else
                txt = svar;
            if (txt.toLowerCase().equals(ordet)){
                System.out.println(txt);
                System.out.println("rätt");
                System.exit(0);
            }


        }
    }


}
