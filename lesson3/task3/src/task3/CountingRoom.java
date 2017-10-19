
package task3;


public class CountingRoom {
    private int salary;
    
    
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
