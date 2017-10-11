package task3;

import task3.ProductPart;

public class LineStep implements ILineStep {
	public IProductPart productPart; //general variable for calling buildProductPart() method with differrent parametres.
	public IProductPart productPart1;
	public IProductPart productPart2;
	public IProductPart productPart3;

	@Override
	public IProductPart buildProductPart() {
		String name = null;
		ProductPart productPart = new ProductPart(name);
		System.out.println("Product part was built successfuly. ");
		return productPart;
	}

	public void firstLineStep(IProduct product) {

		product.installFirstPart(productPart1);
	}

	public void secondLineStep(IProduct product) {

		product.installSecondPart(productPart2);
	}

	public void thirdLineStep(IProduct product) {

		product.installThirdPart(productPart3);
	}

}
