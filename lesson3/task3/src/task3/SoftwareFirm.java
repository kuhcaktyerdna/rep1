package task3;

public class SoftwareFirm {

    private Employee developmentDepartment[];
    private String name;
    private int salary;
    private int members;

    public SoftwareFirm(int num){
        developmentDepartment = new Employee[num];
        members = 0;
    }
    
    public Employee[] addToDepartment(Employee employee){
        developmentDepartment[members]=employee;
        members++;
        return developmentDepartment;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public  void showDepartmentSalary(Employee[] employeesList){
        Printer.print("Summary salary is (in $): "+countSalary(employeesList));
        
    }
    
    private int countSalary(Employee[] employeesList){
        salary = 0;
        for(int i=0; i<employeesList.length;i++){
            salary += employeesList[i].getSalary();
        }
        return salary;
    }

}
