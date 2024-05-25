package Departamentos;

public class MainDepartment extends Department {
    private String name;

    public MainDepartment(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Departamento Principal: " + name);
        super.showDetails();
    }
}