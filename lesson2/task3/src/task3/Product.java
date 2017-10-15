package task3;

public class Product implements IProduct {

	IProductPart body;
	IProductPart monitor;
	IProductPart motherboard;

	public Product(IProductPart body, IProductPart monitor, IProductPart motherboard) {
		this.body = body;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	@Override
	public void installFirstPart(IProductPart body) {
		this.body = body;
		System.out.println("Body was installed successfuly. ");

	}

	@Override
	public void installSecondPart(IProductPart motherboard) {
		this.motherboard = motherboard;
		System.out.println("Motherboard was installed successfuly. ");

	}

	@Override
	public void installThirdPart(IProductPart monitor) {
		this.monitor = monitor;
		System.out.println("Monitor was installed successfuly. \n");

	}
	
	public IProductPart getBody() {
		return body;
	}
	
	public IProductPart getMotherboard() {
		return motherboard;
	}
	
	public IProductPart getMonitor() {
		return monitor;
	}

}
