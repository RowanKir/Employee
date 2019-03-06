package ac.za.cput;

/**
 * Hello world!
 *
 */
public class Employee
{
    private String fullName;
    private String lastName;
    private int age;

    public Employee()
    {

    }

    public Employee(String fName, String lName, int age)
    {
        fName = fullName;
        lName = lastName;
        age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /*public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }*/
}
