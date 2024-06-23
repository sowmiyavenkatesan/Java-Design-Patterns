import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Iterator pattern is used to iterate any object without worrying about
        // the underlying representation.
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setName("Sowmiya");
        employee1.setEmpId("123");

        Employee employee2 = new Employee();
        employee2.setName("Test");
        employee2.setEmpId("124");

        Employee employee3 = new Employee();
        employee3.setName("Test1");
        employee3.setEmpId("125");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Aggregate<Employee> companyAggregator = new Company(employees);

        Iterator<Employee> employeeIterator = companyAggregator.createIterator();

        while(employeeIterator.hasNext())
        {
            Employee employee = employeeIterator.next();
            System.out.println("Name: "+ employee.getName() + " Emp Id: " + employee.getEmpId());
        }
    }
}