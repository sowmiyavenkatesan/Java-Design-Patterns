import java.util.ArrayList;
import java.util.List;

public class EmployeeIterator implements Iterator<Employee>{

    private List<Employee> employees = new ArrayList<>();
    private int currentIndex = 0;
    EmployeeIterator(List<Employee> employees)
    {
        this.employees = employees;
    }
    @Override
    public boolean hasNext()
    {
        return this.currentIndex < this.employees.size();
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return employees.get(this.currentIndex++);
        } else {
            throw new RuntimeException("No more elements to access");
        }
    }
}