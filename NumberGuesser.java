import java.util.Scanner;

public class NumberGuesser {
    static Scanner scanner = new Scanner(System.in);

    public static void guess(int maxNumber){
        int low = 0;
        int high = maxNumber;

        while(high>=low){
            int mid = (high + low)/2;
            if(mid == high && mid == low){
                System.out.println("Die gedachte Zahl ist: " + mid);
                break;
            }
            System.out.println("Ist die gedachte Zahl größer als: " + mid);
            String answer = scanner.nextLine();
            if(answer.equals("yes")){
                low = mid+1;
            }
            if(answer.equals("no")){
                high = mid;
            }
            else{
                System.out.println("Biite antworte mit yes oder no");
            }
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 4);
        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p1, p2);
        // Zeile 5
        System.out.println(r1.width());
        System.out.println(r2.width());
        r1.getUpRight().shift(2, 0);
        System.out.println("---");
        System.out.println(r1.width());
        System.out.println(r2.width()); 
    }
    
}
