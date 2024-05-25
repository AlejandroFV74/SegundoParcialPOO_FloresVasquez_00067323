import java.util.ArrayList;
import java.util.List;

abstract class Department implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void showDetails() {
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

}