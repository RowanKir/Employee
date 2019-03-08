package ac.za.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Before
    public void setUp() throws Exception {
        newEmp = new Employee();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void equalityNameTest()
    {
        Employee person = new Employee(22, "Rowan");
        Employee person1 = new Employee(22,"Mettas");

       int id =  22;
       String name = "Rowan";
        newEmp.setId(id);
        newEmp.setName(name);

        Assert.assertEquals("Rowan", person.getName());
        Assert.assertEquals("Mettas", person1.getName());
        Assert.assertEquals("Equality---Rowan", "Mettas", newEmp.getName());
    }

    @Test
    public void checkSameReferenceTest()
    {
        Employee person = new Employee(22, "Rowan");
        Employee person1 = new Employee(22,"Mettas");
        Employee person3 = new Employee(22,"Jeanan");

        int id =  22;
        String name = "Rowan";
        newEmp.setId(id);
        newEmp.setName(name);

        Assert.assertSame("Identity",person.getName(), person1.getName());
        Assert.assertSame("Identity",person.getName(), person3.getName());
        Assert.assertSame("IDENTITY---Rowan",newEmp.getName(), person3.getName());
    }

    @Test(timeout =  1)
    public void timeOutTest()
    {

//       Assert.assertTrue(true);

    }

    @Test
    public void failTest()
    {

        Employee person = new Employee(22, "Rowan");
        Assert.assertSame("failing","Oom Row", employee.getName());
     
    }


    @Ignore("lets get this money")
    @Test
    public void ignoreTest()
    {
        Assert.assertFalse(false);

    }
}
