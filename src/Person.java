public class Person {

    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Returns the person's name
    public String getName() {
        return name;
    }

    // Displays the person
    public void showPerson() {
        System.out.println("Person: " + name);
    }
}
