public class NonAcademicStaff extends Staff {

    private String workArea;

    public NonAcademicStaff(String name, int staffId, String workArea) {
        super(name, staffId);
        this.workArea = workArea;
    }

    @Override
    protected void sayJobDetails() {
        System.out.print("Ich bin nicht-wissenschaftliches Personal und arbeite im Bereich " + workArea + ". ");
    }

}
