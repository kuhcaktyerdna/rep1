package task3;

public class AssemblyLine implements IAssemblyLine {

	IProductPart body;
	IProductPart monitor;
	IProductPart motherboard;
	ILineStep bodyLineStep;
	ILineStep motherboardLineStep;
	ILineStep monitorLineStep;
	
	
	
	public AssemblyLine(ILineStep bodyLineStep, ILineStep motherboardLineStep, ILineStep monitorLineStep, IProduct product) {
		this.bodyLineStep=bodyLineStep;
		this.motherboardLineStep= motherboardLineStep;
		this.monitorLineStep=monitorLineStep;
		

	}

	@Override
	public IProduct assembleProduct(IProduct laptop) {
		laptop.installFirstPart(bodyLineStep.buildProductPart());
		laptop.installSecondPart(motherboardLineStep.buildProductPart());
		laptop.installThirdPart(monitorLineStep.buildProductPart());
		System.out.println("All product's parts were installed successfully. Assembling is started.");
		System.out.println("Product was assembled successfuly");
		return laptop;
	}

}
