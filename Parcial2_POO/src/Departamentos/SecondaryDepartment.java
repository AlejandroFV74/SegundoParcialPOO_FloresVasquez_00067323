package Departamentos;

import Departamentos.Department;

public class SecondaryDepartment extends Department {
    private String name;

    public SecondaryDepartment(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Departamento Secundario: " + name);
        super.showDetails();
    }
}