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
        Employee[] employees = {relManager, dev, prodManager, progManager, tester,};
        employees = softFirm.addToDepartment(tester);
        employees = softFirm.addToDepartment(dev);
        employees = softFirm.addToDepartment(prodManager);
        employees = softFirm.addToDepartment(progManager);
        employees = softFirm.addToDepartment(relManager);
        Printer.print(employees.length);
        Printer.print("There are "+employees.length+" members in department: "+tester.getName()+", "+dev.getName()+", "+prodManager.getName()+", "+progManager.getName()+", "+relManager.getName()+". ");
    }

}
