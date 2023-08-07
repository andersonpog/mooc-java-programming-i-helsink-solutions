public class Book {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public Book(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName + " pages, " + this.identificationNumber;
    }
}
