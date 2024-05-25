package Empleado;

import Interfaz.Employee;

public class EmployeeImpl implements Employee {
    private String name;

    public EmployeeImpl(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Empleado: " + name);
    }
}
