public class AcademicPerson extends Person implements IsProfessor {

    private String academicDegree;

    public AcademicPerson(String givenName, String lastName, String academicDegree) {
        super(givenName, lastName);
        this.academicDegree = academicDegree;
    }

    @Override
    public boolean isProfessor() {
        return academicDegree.startsWith("Prof.");
    }

    public String getAcademicDegree() {
        return this.academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

}
