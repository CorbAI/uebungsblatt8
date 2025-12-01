public class Kreis extends Figur{

    private double radius;

    //allgemeiner constructor, wenn Instanz nur mit seitenlänge erstellt wird
    public Kreis(double radius){
        super("Schwarz", "Weiß");
        this.radius = radius;
    }

    //spezieller constructor, wenn Instanz auch mit linienfarbe und füllfarbe erstellt wird
    public Kreis(double radius, String linienfarbe, String füllfarbe){
        super(linienfarbe, füllfarbe);
        this.radius = radius;
    }

    //get set methoden
    public void setRadius(double neuerRadius){
        this.radius = neuerRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    //Berechnung Kreisumfang
    public double kreisumfang(){
        return 2 * Math.PI * this.radius;
    }


}
