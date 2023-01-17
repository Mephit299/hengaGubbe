public class Levi {
    public static String title(String ord, String gissning, String ___){
        String txt = ""; // Det här fungerar för tillfället. Byt namn från "title"
        gissning = gissning.toLowerCase();
        if (ord.contains(gissning)){
            if (gissning.length()>1)
                if (gissning.equals(ord))
                    return gissning;
                else {return "ordFalse";} // hitta vart gissningen finns i ordet. (fråga magnus om det här behövs)


            int x = ord.length();
            for (int y=0;y<x; y++){
                String z = String.valueOf(ord.charAt(y));
                String a = String.valueOf(___.charAt(y));
                if (z.equals(gissning) && txt.equals(""))
                    txt += gissning.toUpperCase();
                else if (z.equals(gissning))
                    txt += gissning;
                else if (a != "_")
                    txt += ___.charAt(y);
                else
                    txt += "_";
            }
        }
        else{
            gissning = "false";
            return gissning;
        }
        return txt;
    }

    public static String lagligGissning(String gissning) {
        String e = "abcdefghijklmnopqrstuvwxyzåäö";
        int y = gissning.length();
        int z = e.length();
        String txt = "";
        for (int x =0;x<y;x++){
            for (int a = 0; a<y; a++)
                if (gissning.charAt(x)==e.charAt(y))
                    txt += "r";

        }
        if (txt.length()==y)
            return "true";
        else return "false";

    }

}
