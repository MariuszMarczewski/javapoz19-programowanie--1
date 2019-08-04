package pl.sdaacademy.javapoz19programowanie;

public class Author {

    private String firstName;
    private String lastName;
    private int birthYear;
    private Nation nation;



    public Author() {

    }

    public Author(String firstName, String lastName, int birthYear, Nation nation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return  firstName + " "
             + lastName + " " +
                 birthYear +
                " " + nation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}
