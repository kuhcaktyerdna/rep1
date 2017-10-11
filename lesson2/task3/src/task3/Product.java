package task3;

public class Product implements IProduct {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void installFirstPart(IProductPart productPart1) {

		System.out.println("First part was installed successfuly. ");

	}

	@Override
	public void installSecondPart(IProductPart productPart2) {
		System.out.println("Second part was installed successfuly. ");

	}

	@Override
	public void installThirdPart(IProductPart productPart3) {
		System.out.println("Third was installed successfuly. \n");

	}

}
