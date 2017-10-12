package task3;

import task3.ProductPart;
import task3.Product;
import task3.LineStep;

public class Task3 {

	public static void main(String[] args) {
		IProductPart body = new ProductPart("Body");
		System.out.println(((ProductPart) body).getName() + " scheme was created. ");
		IProductPart monitor = new ProductPart("Monitor");
		System.out.println(((ProductPart) monitor).getName() + " scheme was created. ");
		IProductPart motherboard = new ProductPart("Motherboard");
		System.out.println(((ProductPart) motherboard).getName() + " scheme was created. ");
		ILineStep bodyLineStep = new LineStep();
		ILineStep monitorLineStep = new LineStep();
		ILineStep motherboardLineStep = new LineStep();
		body = bodyLineStep.buildProductPart();
		((ProductPart) body).setName("Body");
		System.out.println(((ProductPart) body).getName() + " was built successfuly. ");
		monitor = monitorLineStep.buildProductPart();
		((ProductPart) monitor).setName("Monitor");
		System.out.println(((ProductPart) monitor).getName() + " was built successfuly. ");
		motherboard = motherboardLineStep.buildProductPart();
		((ProductPart) motherboard).setName("Motherboard");
		System.out.println(((ProductPart) motherboard).getName() + " was built successfuly. ");
		IProduct laptop = new Product();
		System.out.println("Product scheme was created.");
		IAssemblyLine assemblyLine = new AssemblyLine(body, monitor, motherboard, laptop);
		laptop = assemblyLine.assembleProduct(laptop);

	}

}
