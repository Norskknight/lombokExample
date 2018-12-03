package entity;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotSame;

public class PersonLombokTest {

    private static PersonLombok lombokTest;
    private static List family;

    @BeforeClass
    public static void setUpClass() {
        lombokTest = new PersonLombok("First", "Last",1,"123 Road");
        family = new ArrayList();
        family.add("First Family name");
        family.add("Second Family name");
        lombokTest.setFamily(family);
        lombokTest.setMiddleName("test");

    }
    @Test
    public void getFamily() {
        lombokTest.setFamily(family);
        List Family = lombokTest.getFamily();
        assertEquals(family,Family);
    }

    @Test
    public void setFamily() {
        lombokTest.setFamily(Collections.singletonList("frank,carl"));
        List Family = lombokTest.getFamily();
        assertEquals(Collections.singletonList("frank,carl"),Family);
    }




    @Test
    public void setFirstName() {
        lombokTest.setFirstName("testFirst");
        assertEquals("testFirst",lombokTest.getFirstName());
    }

    @Test
    public void getFirstName() {
        assertEquals("First",lombokTest.getFirstName());
    }

    @Test
    public void setMiddleName() {
        lombokTest.setMiddleName("test");
        assertEquals("test",lombokTest.getMiddleName());
    }

    @Test
    public void getMiddleName() {
        lombokTest.setMiddleName("test");
        assertEquals("test",lombokTest.getMiddleName());
    }

    @Test
    public void getLastName() {
        lombokTest.setLastName("Last");
        assertEquals("Last",lombokTest.getLastName());
    }

    @Test
    public void setLastName() {
        lombokTest.setLastName("testLast");
        assertEquals("testLast",lombokTest.getLastName());
    }

    @Test
    public void setId() {
        lombokTest.setId(3);
        assertEquals(3,lombokTest.getId());
    }

    @Test
    public void getId() {
        assertEquals(1,lombokTest.getId());
    }

    @Test
    public void setAddress() {
        lombokTest.setAddress("Test Address");
        assertEquals("Test Address",lombokTest.getAddress());
    }

    @Test
    public void getAddress() {
        assertEquals("123 Road",lombokTest.getAddress());
    }

    @Test
    public void testHashCode() {
        PersonLombok hashTest = new PersonLombok("carl","last",6,"house");
        assertNotSame(lombokTest.hashCode(), hashTest.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("PersonLombok(firstName=First, middleName=test, lastName=Last, id=1, address=123 Road, family=[First Family name, Second Family name])",lombokTest.toString());
    }

    @Test
    public void equals() {
        PersonLombok equalsTest = new PersonLombok("carl","last",6,"house");
        PersonLombok equalsTest2 = new PersonLombok("carl","last",6,"house");
        assert(equalsTest.equals(equalsTest2));
    }

    @Test
    public void canEqual() {
        PersonLombok equalsTest = new PersonLombok("carl","last",6,"house");
        PersonLombok equalsTest2 = new PersonLombok("carl","last",6,"house");
        assert(equalsTest.equals(equalsTest2));
    }
}