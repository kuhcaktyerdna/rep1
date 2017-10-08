package task3;
import task3.ProductPart;
import task3.Product;
public class task3  {
	
	public static void main (String[] args) {
	ProductPart body = new ProductPart("Body");
	body.buildProductPart();
	ProductPart motherboard = new ProductPart("Motherboard");
	motherboard.buildProductPart();
	ProductPart monitor = new ProductPart("Monitor");
	monitor.buildProductPart();
	Product laptop = new Product();
	laptop.installFirstPart(body);
	laptop.installSecondPart(motherboard);
	laptop.installThirdPart(monitor);
	laptop.setName("Laptop");
	AssemblyLine assemblyL = new AssemblyLine(body, motherboard, monitor);
	assemblyL.assembleProduct(laptop);
	}

	
	

}
