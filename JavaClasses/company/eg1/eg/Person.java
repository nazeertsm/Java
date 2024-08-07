package JavaClasses.company.eg1.eg;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;

    //Address is defined, java dont know, create a class
    private Address address;
    private Person spouse;

    private Pet pet;


    public Person (String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;

    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob () {
        return dob;
    }

    public void setDob (LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress () {
        return address;
    }


    public void setAddress (Address address) {
        this.address = address;

    }

    public Person getSpouse () {
        return spouse;
    }

    public void setSpouse (Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet () {
        return pet;
    }

    public void setPet (Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString () {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }
}
