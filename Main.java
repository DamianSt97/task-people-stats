

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class PeopleStats {

}

class Person {
    private final String firstName;
    private final String LastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return firstName;
    }
}