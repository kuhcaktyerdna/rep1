package task3;

public class Task3 {

	public static void main(String[] args) {
		IProductPart body = new Body("Body");
		System.out.println("Body scheme was created. ");
		IProductPart motherboard = new Motherboard("Motherboard");
		System.out.println("Motherboard scheme was created. ");
		IProductPart monitor = new Monitor("Monitor");
		System.out.println("Monitor scheme was created. \n");
		ILineStep bodyLineStep = new BodyLineStep();
		ILineStep motherboardLineStep = new MotherboardLineStep();
		ILineStep monitorLineStep = new MonitorLineStep();
		body = bodyLineStep.buildProductPart();
		motherboard = motherboardLineStep.buildProductPart();
		monitor = monitorLineStep.buildProductPart();
		IProduct laptop = new Product(body, monitor, motherboard);
		System.out.println("Product scheme was created.");
		IAssemblyLine assemblyLine = new AssemblyLine(laptop);
		laptop = assemblyLine.assembleProduct(laptop);

	}

}
