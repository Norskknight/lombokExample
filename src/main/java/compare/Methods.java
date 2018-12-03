package compare;
import entity.PersonJava;
import entity.PersonLombok;
import java.util.Collections;

public class Methods {
    private void compareMethods() {
        PersonJava personJava     = new PersonJava("first", "Last", 1, "address");
        PersonLombok personLombok = new PersonLombok("first", "Last", 1, "address");
        // person java methods

        personJava.setAddress("address");
        personJava.setId(1);
        personJava.setLastName("last");
        personJava.setMiddleName("middle");
        personJava.setFirstName("First");
        personJava.setFamily(Collections.singletonList("family"));

        personJava.getAddress();
        personJava.getId();
        personJava.getLastName();
        personJava.getMiddleName();
        personJava.getFirstName();
        personJava.getFamily();

        personJava.toString();

        //person Lombok methods

        personLombok.setAddress("address");
        personLombok.setId(1);
        personLombok.setLastName("last");
        personLombok.setMiddleName("middle");
        personLombok.setFirstName("First");
        personLombok.setFamily(Collections.singletonList("family"));

        personLombok.getAddress();
        personLombok.getId();
        personLombok.getLastName();
        personLombok.getMiddleName();
        personLombok.getFirstName();
        personLombok.getFamily();

        personLombok.toString();
        //extra lombok added methods
        personLombok.equals(personLombok);
        personLombok.hashCode();
    }
}