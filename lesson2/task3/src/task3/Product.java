package task3;

public class Product implements IProduct {

	private String name;
	IProductPart body;
	IProductPart monitor;
	IProductPart motherboard;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void installFirstPart(IProductPart body) {
		this.body = body;
		System.out.println("First part was installed successfuly. ");

	}

	@Override
	public void installSecondPart(IProductPart monitor) {
		this.monitor = monitor;
		System.out.println("Second part was installed successfuly. ");

	}

	@Override
	public void installThirdPart(IProductPart motherboard) {
		this.motherboard = motherboard;
		System.out.println("Third was installed successfuly. \n");

	}

}
