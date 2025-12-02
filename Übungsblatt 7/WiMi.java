public class WiMi extends Staff {

    private Professor assignedProf;

    public WiMi(String name, int staffId, Professor assignedProf) {
        super(name, staffId);
        this.assignedProf = assignedProf;
    }

    @Override
    protected void sayJobDetails() {
        System.out.print("Ich bin WiMi bei Professor " + assignedProf.getName() + " im Forschungsgebiet "
                + assignedProf.getProfResearchArea() + ". ");
    }

}
