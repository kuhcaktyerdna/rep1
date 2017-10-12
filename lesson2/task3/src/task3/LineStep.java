package task3;

public class LineStep implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		String name = null;
		ProductPart productPart = new ProductPart(name);
		return productPart;
	}

}
