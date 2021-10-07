package uk.access.modifiers;

public class Pilot {

    private String firstname;
    private String lastname;
    private String licenseNumber;

    public Pilot(String firstname,String lastname,String licenseNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}
