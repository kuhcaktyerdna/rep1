package task3;

public class AssemblyLine implements IAssemblyLine {

	IProductPart productPart1;
	IProductPart productPart2;
	IProductPart productPart3;
	ILineStep lineS;

	public AssemblyLine(IProductPart productPart1, IProductPart productPart2, IProductPart productPart3,
			IProduct product) {
		this.productPart1 = productPart1;
		this.productPart2 = productPart2;
		this.productPart3 = productPart3;
		System.out.println("Installing product parts according to product scheme...");
		product.installFirstPart(productPart1);
		product.installSecondPart(productPart2);
		product.installThirdPart(productPart3);

	}

	@Override
	public IProduct assembleProduct(IProduct product) {
		System.out.println("All product's parts were installed successfully. Assembling is started.");
		System.out.println("Product was assembled successfuly");
		return product;
	}

}
