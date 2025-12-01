import java.util.Scanner;

public class ShapeApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape[] shapes = new Shape[10];

		System.out.println("Bitte geben Sie eine geometrische Form ein. Zur Auswahl stehen:\nDreieck\nQuadrat\nLinie\n\nZum Beenden des Programmes geben Sie \"Ende\" ein.");
		for(int i=0;i<shapes.length;i++) {
			String input = scanner.nextLine();
			if(input.equals("Linie")){
				Line a = new Line();
				shapes[i] = a;
			}
			if(input.equals("Quadrat")){
				Square a = new Square();
				shapes[i] = a;
			}
			if(input.equals("Dreieck")){
				Triangle a = new Triangle();
				shapes[i] = a;
			}
			if(input.equals("Ende")){
				break;
			}
		}
		scanner.close();
		
		for(int i=0;i<shapes.length;i++) {
			if (shapes[i] != null) {
				shapes[i].printShape();
				System.out.println();
			}
		}
	}
}
