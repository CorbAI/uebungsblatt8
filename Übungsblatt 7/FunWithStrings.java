public class FunWithStrings {

    // Wörter zählen, die durch ein Leerzeichen getrennt sind
    public static int countWords(String text) {
        if (text == null) {
            return -1;
        }
        char[] textArray = text.toCharArray();
        int wordCount = 1;
        // Prüfung auf Leerheit
        if (textArray.length == 0) {
            return 0;
        }
        // Erhöhung des WordCounts wenn ein Leerzeichen vorkommt
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == ' ') {
                wordCount += 1;
            }
        }
        // Verringern des WordCounts wenn der Text mit einem Leerzeichen anfängt oder
        // endet
        if (textArray[0] == ' ' || textArray[textArray.length - 1] == ' ') {
            wordCount -= 1;
        }

        return wordCount;
    }

    public static String getQuotedText(String text) {
        if (text == null) {
            return null;
        }
        char[] textArray = text.toCharArray();

        // Prüfung auf Leerheit
        if (textArray.length == 0) {
            return null;
        }

        int first = -1;
        int second = -1;

        // Suche nach dem ersten doppelten Anführungszeichen
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == '"') {
                first = i;
                break;
            }
        }

        // Abbruch, wenn kein erstes gefunden wurde
        if (first == -1)
            return null;

        // Suche nach dem zweiten doppelten Anführungszeichen
        for (int i = first + 1; i < textArray.length; i++) {
            if (textArray[i] == '"') {
                second = i;
                break;
            }
        }

        // Abbruch, wenn kein zweites gefunden wurde
        if (second == -1)
            return null;

        // Aufnahme des Wortes von start bis end
        String output = "";
        for (int i = first + 1; i < second; i++) {
            output += textArray[i];
        }
        return output;

    }

    public static String commonPrefix(String text1, String text2) {

        // Prüfung auf 2 nicht leere Strings
        if (text1 == null || text2 == null) {
            System.out.print("Es wurden keine 2 Wörter übergeben");
            return null;
        }

        char[] textArray1 = text1.toCharArray();
        char[] textArray2 = text2.toCharArray();

        // Zählen der gemeinsamen Buchstaben
        int count = 0;
        for(int i=0; i < Math.min(textArray1.length, textArray2.length); i++){
            if(textArray1[i] == textArray2[i]){
                count++;
                continue;
            }
            else{
                break;
            }
        }

        // Erstellung output
        String output = "";
        for(int i=0; i < count; i++){
            output += textArray1[i];
        }

        return output;
    }

    /*public static void main(String[] args) {
        String s = "vorher \"\" nachher";
        System.out.println(countWords(s));
        System.out.println(getQuotedText(s));
    }*/
}
