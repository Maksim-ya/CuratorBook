package model;


public class Note {
    String lastName;
    String firstName;
    String yearOfBirth;
    String phoneNumber;
    String address;

    public Note() {
    }

    public Note(String lastName,
                String firstName,
                String yearOfBirth,
                String phoneNumber,
                String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Note{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
