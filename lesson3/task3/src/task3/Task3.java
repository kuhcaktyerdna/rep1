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
        SoftwareFirm softFirm = new SoftwareFirm(5);
        softFirm.setName("Firm name");
        Employee[] department = {relManager, dev, prodManager, progManager, tester,};
        department = softFirm.addToDepartment(tester);
        department = softFirm.addToDepartment(dev);
        department = softFirm.addToDepartment(prodManager);
        department = softFirm.addToDepartment(progManager);
        department = softFirm.addToDepartment(relManager);
        Printer.print("There are "+department.length+" members in department: "+tester.getName()+", "+dev.getName()+", "+prodManager.getName()+", "+progManager.getName()+", "+relManager.getName()+". ");
        softFirm.showDepartmentSalary(department);
    }

}
