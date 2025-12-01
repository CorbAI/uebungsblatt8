public class Quadrat extends Figur {
    
    private double seitenlänge;

    //allgemeiner constructor, wenn Instanz nur mit seitenlänge erstellt wird
    public Quadrat(double seitenlänge){
        super("Schwarz", "Weiß");
        this.seitenlänge = seitenlänge;
    }

    //spezieller constructor, wenn Instanz auch mit linienfarbe und füllfarbe erstellt wird
    public Quadrat(double seitenlänge, String linienfarbe, String füllfarbe){
        super(linienfarbe, füllfarbe);
        this.seitenlänge = seitenlänge;
    }

    //get set methoden
    public void setSeitenlänge(double neueSeitenlänge){
        this.seitenlänge = neueSeitenlänge;
    }

    public double getSeitenlänge(){
        return this.seitenlänge;
    }

    //Berechnung Flächeninhalt
    public double flächeninhalt(){
        return this.seitenlänge*this.seitenlänge;
    }
}
