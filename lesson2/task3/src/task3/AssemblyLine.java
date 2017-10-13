package task3;

public class AssemblyLine implements IAssemblyLine {

	IProductPart body;
	IProductPart monitor;
	IProductPart motherboard;

	public AssemblyLine(IProduct product) {
		body= ((Product) product).getBody();
		motherboard= ((Product) product).getMotherboard();
		monitor= ((Product) product).getMonitor();
		System.out.println("Installing product parts according to product scheme... \n");
		product.installFirstPart(body);
		product.installSecondPart(motherboard);
		product.installThirdPart(monitor);

	}

	@Override
	public IProduct assembleProduct(IProduct product) {
		System.out.println("All product's parts were installed successfully. Assembling is started.");
		System.out.println("Product was assembled successfuly");
		return product;
	}

}
