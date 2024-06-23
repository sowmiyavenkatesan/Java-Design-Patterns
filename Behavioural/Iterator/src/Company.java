import java.util.List;

public class Company implements Aggregate<Employee>{

    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public Iterator<Employee> createIterator()
    {
        return new EmployeeIterator(this.employees);
    }
}