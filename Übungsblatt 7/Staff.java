public class Staff extends Person {

    protected int staffId;

    public Staff(String name, int staffId) {
        super(name);
        this.staffId = staffId;

    }

    @Override
    public void introduce() {
        super.introduce();
        sayJobDetails();
        System.out.println("Ich arbeite an der Uni und meine Personalnummer lautet: " + staffId + ". ");
    }

    protected void sayJobDetails() {

    }

}
