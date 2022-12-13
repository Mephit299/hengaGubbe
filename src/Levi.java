public class Levi {
    public static String title(String ord, String gissning, String ___){
        String txt = "";
        gissning = gissning.toLowerCase();
        if (ord.contains(gissning)){
            if (gissning.length()>1){
                if (gissning.equals(ord))
                    return gissning;
                else {} // hitta vart gissningen finns i ordet. (fråga magnus om det här behövs)
            }

            int x = ord.length();
            for (int y=0;y<x; y++){
                String z = String.valueOf(ord.charAt(x));
                String a = String.valueOf(___.charAt(x));
                if (z.equals(gissning) && txt.equals(""))
                    txt = txt + gissning.toUpperCase();
                else if (z.equals(gissning))
                    txt = txt + gissning;
                else if (a != "_")
                    txt = txt + ___.charAt(x);
                else
                    txt = txt +"_";
            }
        }
        else{
            gissning = "false";
            return gissning;
        }
        return txt;

    }
}
