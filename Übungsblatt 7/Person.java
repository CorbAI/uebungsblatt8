public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void introduce() {
        System.out.print("Hallo, mein Name ist " + name + ". ");
    }

}
