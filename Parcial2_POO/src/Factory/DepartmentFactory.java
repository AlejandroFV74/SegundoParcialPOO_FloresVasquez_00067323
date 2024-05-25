package Factory;

import Departamentos.Department;
import Departamentos.MainDepartment;
import Departamentos.SecondaryDepartment;

public class DepartmentFactory {
    public static Department createMainDepartment(String name) {
        return new MainDepartment(name);
    }

    public static Department createSecondaryDepartment(String name) {
        return new SecondaryDepartment(name);
    }
}