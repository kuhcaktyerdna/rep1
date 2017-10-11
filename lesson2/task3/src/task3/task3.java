package task3;

import task3.ProductPart;
import task3.Product;
import task3.LineStep;

public class task3 {

	public static void main(String[] args) {
		ILineStep lineS = new LineStep();
		IProductPart body = lineS.buildProductPart();
		((ProductPart) body).setName("Body");
		System.out.println("Product part name: " + ((ProductPart) body).getName()+"\n");
		IProductPart motherboard = lineS.buildProductPart();
		((ProductPart) motherboard).setName("Motherboard");
		System.out.println("Product part name: " + ((ProductPart) motherboard).getName()+"\n");
		IProductPart monitor = lineS.buildProductPart();
		((ProductPart) monitor).setName("Monitor");
		System.out.println("Product part name: " + ((ProductPart) monitor).getName()+"\n");
		IProduct laptop = new Product();
		AssemblyLine assemblyLine = new AssemblyLine(body, monitor, motherboard, lineS, laptop);
		laptop = assemblyLine.assembleProduct(new Product());
		((Product) laptop).setName("Laptop");
		System.out.println("Product name: " + ((Product) laptop).getName());

	}

}
