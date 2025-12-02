public class Main {

    public static void main(String[] args) {
        Quadrat quadrat1 = new Quadrat(3);
        Quadrat quadrat2 = new Quadrat(4, "Blau", "Rot");

        Kreis kreis1 = new Kreis(3);

        double umfangKreis1 = kreis1.kreisumfang();
        System.out.println(umfangKreis1);

        System.out.println(quadrat1.getFüllfarbe());
        System.out.println(quadrat2.getLinienfarbe());

        
    }

}
