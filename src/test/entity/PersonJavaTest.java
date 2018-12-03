package entity;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotSame;

public class PersonJavaTest {

    private static PersonJava javaTest;
    private static List family;

    @BeforeClass
    public static void setUpClass() {
        javaTest = new PersonJava("first", "Last",1,"123 Road");
        family = new ArrayList();
        family.add("First Family name");
        family.add("Second Family name");
        javaTest.setFamily(family);
        javaTest.setMiddleName("test");
    }

    @Test
    public void setFamily() {
        javaTest.setFamily(Collections.singletonList("frank,carl"));
        List Family = javaTest.getFamily();
        assertEquals(Collections.singletonList("frank,carl"),Family);
    }

    @Test
    public void getFamily() {
        javaTest.setFamily(family);
        List Family = javaTest.getFamily();
        assertEquals(family,Family);
    }


    @Test
    public void setFirstName() {
        javaTest.setFirstName("testFirst");
        assertEquals("testFirst",javaTest.getFirstName());
    }

    @Test
    public void getFirstName() {
        javaTest.setFirstName("First");
        assertEquals("First",javaTest.getFirstName());
    }

    @Test
    public void setMiddleName() {
        javaTest.setMiddleName("test");
        assertEquals("test",javaTest.getMiddleName());
    }

    @Test
    public void getMiddleName() {
        assertEquals("test",javaTest.getMiddleName());
    }

    @Test
    public void setLastName() {
        javaTest.setLastName("testLast");
        assertEquals("testLast",javaTest.getLastName());
    }

    @Test
    public void getLastName() {
        javaTest.setLastName("Last");
        assertEquals("Last",javaTest.getLastName());
    }

    @Test
    public void setId() {
        javaTest.setId(3);
        assertEquals(3,javaTest.getId());
    }

    @Test
    public void getId() {
        assertEquals(1,javaTest.getId());
    }

    @Test
    public void setAddress() {
        javaTest.setAddress("Test Address");
        assertEquals("Test Address",javaTest.getAddress());
    }

    @Test
    public void getAddress() {
        assertEquals("123 Road",javaTest.getAddress());
    }


    @Test
    public void testToString() {
        assertEquals("PersonJava{firstName='first', middleName='test', lastName='Last', id=1, address='123 Road', family=[First Family name, Second Family name]}",javaTest.toString());
    }
}