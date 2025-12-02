public class Professor extends Staff {

    private String researchArea;

    public Professor(String name, int staffId, String researchArea) {
        super(name, staffId);
        this.researchArea = researchArea;
    }

    public String getProfResearchArea() {
        return this.researchArea;
    }

    @Override
    protected void sayJobDetails() {
        System.out.print("Ich bin Professor und mein Forschungsgebiet ist " + researchArea + ". ");
    }

    public void changeResearchArea(String newResearchArea) {
        researchArea = newResearchArea;
    }

}
