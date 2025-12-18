public class CountVocals {


	public static boolean isVocal(String letter){
		if(letter.equals("a" || "e" ||"i" || "o" || "u")){
			return true;
		}
	}

	static public int countVocals(final String s) {
		int count = 0;
		if(s.length() <= 1){
			return count;
		}
		return countVocals(s.substring(1).isVocal)+ s.charAt(0);
	}

	public static void main(String[] args) {
		String test = "TimmderHs";
		countVocals(test);
	}
}
