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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
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
