public abstract class Figur {

    //Eigenschaften von Quadrat und Kreis:
    private String linienfarbe;
    private String füllfarbe;

    //constructor
    public Figur(String linienfarbe, String füllfarbe){
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
}
