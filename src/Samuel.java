public class Samuel {
    public static String gissat(String gissat, String gissning, String gissadeord) {
        if (gissat.contains(gissning)){return "bokstavgissat";}
        else if (gissadeord.contains(gissning) && gissning.length()>1) {return "ordgissat";}

        if (gissning.length()<=1) {
            gissat = gissat + gissning;
            return gissat;
        }
        else {
            gissadeord = gissadeord+gissat;
            return gissadeord;
        }

    }

    public static String gubbe(int antalgissningar){
        String gubbe;

         if (antalgissningar == 0) {
             gubbe = (

                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "    /|\\  |  \n" +
                             "    / \\  |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }
        else if (antalgissningar == 10) {
             gubbe = (

                     "   \n" +
                             "  \n" +
                             "  \n" +
                             "  \n" +
                             "  \n" +
                             "  \n" +
                             "  \n" +
                             "  \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

        else if (antalgissningar == 9) {
             gubbe = (
                     "  \n" +
                             "    \n" +
                             "    \n" +
                             "    \n" +
                             "    \n" +
                             "    \n" +
                             "     _________ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

        else if (antalgissningar == 8) {
             gubbe = (
                     "   \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 7) {
             gubbe = (
                     "     +---+  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 6) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 5) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 4) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "     |   |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 3) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "    /|   |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 2) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "    /|\\  |  \n" +
                             "         |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }

         else if (antalgissningar == 1) {
             gubbe = (
                     "     +---+  \n" +
                             "     |   |  \n" +
                             "     O   |  \n" +
                             "    /|\\  |  \n" +
                             "    /    |  \n" +
                             "         |  \n" +
                             "     ____|____ \n" +
                             "    /         \\ \n" +
                             " ～～～～～～～～～～～"
             );
             return gubbe;
         }
         return "";
    }

}
