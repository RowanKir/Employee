package ac.za.cput;

/**
 * Hello world!
 *
 */
public class Employee
{
    private int id;
    private String name;

    public Employee()
    {

    }

     public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name);
    }

    public int hashCode()
    {

        return Objects.hash(name);
    }
//testing nvm
public int money(int a ,int b)
{
    return a + b;

}
}
