public class Fraction {

    private int numerator;
    private int denominator;

    //constructor für eine instanz mit zähler und nenner
    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        }

    //constuctor für eine ganze zahl
    public Fraction(int n){
        this.numerator = n;
        this.denominator = 1;
    }

    //Bruch mit einem anderen Bruch multiplizieren
    public void multiply(Fraction factor){
        this.numerator *= factor.numerator;
        this.denominator *= factor.denominator;
    }

    //Bruch mit einem anderen Bruch addieren
    public void add(Fraction summand){
        this.numerator = this.numerator*summand.denominator + this.denominator*summand.numerator;
        this.denominator *= summand.denominator;
    }

    //Bruch ausgeben
    public String toString(){
        return String.valueOf(this.numerator)+"/"+String.valueOf(denominator);
    }

    //Wert des Bruches als double zurückgeben
    public double asDouble(){
        return (double) this.numerator / this.denominator;
    }




}
