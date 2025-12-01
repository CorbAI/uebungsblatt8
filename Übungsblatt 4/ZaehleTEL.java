import java.util.Scanner;

public class ZaehleTEL {
	public static void main(String args[]) {

		String eingabe = "";

		//Benutzer wird mithilfe eines scanners nach Eingabe gefragt; wird in eingabe gespeichert.
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Geben sie eine Zeichenfolge ein:");
			eingabe = scanner.nextLine();
		}

		//eingabe in einem char array speichern, nur Kleinbuchstaben
		char[] zeichen = eingabe.toLowerCase().toCharArray();


		int[] ergebnisse = countTEL(zeichen);

		System.out.println("Der Buchstabe 't' kommt " + ergebnisse[0] + " mal vor.");
    	System.out.println("Der Buchstabe 'e' kommt " + ergebnisse[1] + " mal vor.");
    	System.out.println("Der Buchstabe 'l' kommt " + ergebnisse[2] + " mal vor.");
	}

	public static int[] countTEL(char[] wort) {
		int tcount = 0;
		int ecount = 0;
		int lcount = 0;

		//for each Schleife, aktueller Buchstabe ist nur temporär, vergleichbar mit i
		for(char aktuellerBuchstabe : wort){
			switch(aktuellerBuchstabe){
			case 't':
				tcount++;
				break;
			case 'e':
				ecount++;
				break;
			case 'l':
				lcount++;
				break;
			default:
				break;
		}
		}

		//Ergebnisse werden in einem int Array gespeichert und returnt
		int[] ergebnisse = {tcount, ecount, lcount};
		return ergebnisse;
	}
}

