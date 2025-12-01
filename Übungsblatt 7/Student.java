public class Student extends Person {

    private int matrNr;
    private String studyProgram;

    public Student(String name, int matrNr, String studyProgram) {
        super(name);
        this.matrNr = matrNr;
        this.studyProgram = studyProgram;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Ich bin Student im " + studyProgram + " und meine Matrikelnummer ist " + matrNr + ". ");
    }

}
