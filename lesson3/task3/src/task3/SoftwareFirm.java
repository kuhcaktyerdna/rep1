package task3;

public class SoftwareFirm {

    private Employee developmentDepartment[];
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] createDepartment(int n, Employee[] developmentDepartment) {
        developmentDepartment = fillDepartment(n, developmentDepartment);
        return developmentDepartment;
    }

    private Employee[] fillDepartment(int n, Employee[] employees) {
        Employee[] developmentDepartment = new Employee[n];
        System.arraycopy(employees, 0, developmentDepartment, 0, employees.length);
        Printer.print("Development department was created and includes: ");
        for (int i = 0; i < developmentDepartment.length - 1; i++) {
            Printer.print(developmentDepartment[i].getName() + ", ");
        }
        
        return developmentDepartment;
    }

}
