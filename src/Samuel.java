public class Samuel {
    public static String gissat(String gissat, String gissning, String gissadeord) {
        if (gissat.contains(gissning)){return "bokstavgissat";}
        else if (gissadeord.contains(gissning)) {return "ordgissat";}

        if (gissning.length()<=1) {
            gissat = gissat + gissning;
            return gissat;
        }
        else {
            gissadeord = gissadeord+gissat;
            return gissadeord;
        }

    }


}
