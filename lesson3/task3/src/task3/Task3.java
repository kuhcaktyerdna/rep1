package task3;

public class Task3 {

    public static void main(String[] args) {
        Developer dev = new Developer("Developer");
        dev.setSalary(500);
        dev.setRank("Junior");
        Employee prodManager = new ProductManager("Product Manager");
        prodManager.setSalary(400);
        prodManager.setRank("Middle");
        Employee progManager = new ProgrammingManager("Programming Manager");
        progManager.setSalary(400);
        progManager.setRank("Middle");
        Employee relManager = new ReleaseManager("Release Manager");
        relManager.setSalary(400);
        relManager.setRank("Senior");
        Employee tester = new Tester("Tester");
        tester.setSalary(400);
        tester.setRank("Middle");
        SoftwareFirm softFirm = new SoftwareFirm();
        softFirm.setName("Firm name");
        Employee[] employees = {relManager, dev, prodManager, progManager, tester,};
        Employee[] developmentDepartment = softFirm.createDepartment(employees.length, employees);
        CountingRoom cRoom = new CountingRoom();
        cRoom.showDepartmentSalary(developmentDepartment);

    }

}
