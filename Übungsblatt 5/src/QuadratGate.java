public class QuadratGate {

    private String linienfarbe;
    private String füllfarbe;
    private double seitenlänge;

    //allgemeiner constructor, wenn Instanz nur mit seitenlänge erstellt wird
    public QuadratGate(double seitenlänge){
        this.linienfarbe = "schwarz";
        this.füllfarbe = "weiß";
        this.seitenlänge = seitenlänge;
    }

    //spezieller constructor, wenn Instanz auch mit linienfarbe und füllfarbe erstellt wird
    public QuadratGate(double seitenlänge, String linienfarbe, String füllfarbe){
        
        this.seitenlänge = seitenlänge;
        this.linienfarbe = linienfarbe;
        this.füllfarbe = füllfarbe;

    }

    //get set methoden
    public void setLinienfarbe(String neueLinienfarbe){
        this.linienfarbe = neueLinienfarbe;
    }

    public String getLinienfarbe(){
        return this.linienfarbe;
    }

    public void setFüllfarbe(String neueFüllfarbe){
        this.füllfarbe = neueFüllfarbe;
    }

    public String getFüllfarbe(){
        return this.füllfarbe;
    }

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
