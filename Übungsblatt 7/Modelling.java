public class Modelling {

    public static void main(String[] args) {

        Professor mariaWeber = new Professor("Maria Weber", 142, "Theoretische Informatik");
        WiMi theodorGrün = new WiMi("Theodor Grün", 816, mariaWeber);
        Student annaSchmidt = new Student("Anna Schmidt", 10815, "Medieninformatik");
        NonAcademicStaff sabineKoch = new NonAcademicStaff("Sabine Koch", 112, "IT-Support");

        mariaWeber.introduce();
        theodorGrün.introduce();
        annaSchmidt.introduce();
        sabineKoch.introduce();
    }
}
