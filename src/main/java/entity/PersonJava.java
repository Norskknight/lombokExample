package entity;

import java.util.List;

public class PersonJava {

    private String firstName;
    private String middleName;
    private String lastName;
    private int id;
    private String address;
    private List family;


    public PersonJava(String firstName, String lastName, int id, String address) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
    }

    public List getFamily() {
        return family;
    }


    public void setFamily(List family) {
        this.family = family;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getMiddleName() {
        return middleName;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", family=" + family +
                '}';
    }

}