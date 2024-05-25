package Departamentos.Prueba_main;

import Departamentos.*;

import Empleado.EmployeeImpl;
import Factory.DepartmentFactory;

public class TechInnovatorsInc {
    public static void main(String[] args) {
        // Crear departamentos
        Department mainDept = DepartmentFactory.createMainDepartment("Desarrollo");
        Department secondaryDept = DepartmentFactory.createSecondaryDepartment("QA");

        // Agregar empleados
        mainDept.addEmployee(new EmployeeImpl("Juan"));
        mainDept.addEmployee(new EmployeeImpl("María"));
        secondaryDept.addEmployee(new EmployeeImpl("Pedro"));
        secondaryDept.addEmployee(new EmployeeImpl("Marlene"));

        // Mostrar detalles de la empresa
        mainDept.showDetails();
        secondaryDept.showDetails();
    }
}
