import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HengaGubbe {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inList = new Scanner(new File("giltigaOrd.txt"));
        Scanner inGissning = new Scanner(System.in);
        int ord = (int) (Math.random()*101);
        String gissadeBokstaver = "";
        String gissadeOrd = "";
        String resultat = "";
        String ordet = "";
        int kvarståendeFörsök = 11;

        for (int x = 0; x<ord; x++)
           ordet = inList.nextLine();
        String txt ="";
        int ordLenght = ordet.length();
        for (int x = 0; x<ordLenght; x++)
            txt +="_";

        System.out.println(ord);
        while (true) {
            System.out.println(Samuel.gubbe(kvarståendeFörsök) + "Gissa en bokstav eller ett ord. \nOrdet du ska gissa på är" + txt + "\nAntalet kvarsående försök är " + kvarståendeFörsök);
            String gissning = inGissning.nextLine().toLowerCase();
            resultat = Samuel.gissat(gissadeBokstaver, gissning, gissadeOrd);
            if (resultat.equals("bokstavgissat")) {
                System.out.println("Bokstaven " + gissning + " är redan gissad");
            }
            else if (resultat.equals("ordgissat")) {
                System.out.println("Ordet " + gissning + " är redan gissat");
            }
            else {
                if (gissning.length()>1)
                    gissadeOrd = gissadeOrd + gissning;
                else gissadeBokstaver = gissadeBokstaver + gissning;
            String svar = Levi.title(ordet, gissning, txt);
            if (svar.equals("false")){kvarståendeFörsök--;}
            else
                txt = svar;
            if (txt.toLowerCase().equals(ordet)) {
                System.out.println(txt);
                System.out.println("rätt");
                System.exit(0);
            } else if (kvarståendeFörsök==0) {
                System.out.println(Samuel.gubbe(kvarståendeFörsök) + "\nSlut på försök");
                System.out.println("Ordet var " + ordet);
                System.exit(0);

            }
            }
        }

    }
}

