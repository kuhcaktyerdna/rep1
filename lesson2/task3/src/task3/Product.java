package task3;

public  class Product implements  IProduct {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	
	

	@Override
	public void installFirstPart(IProductPart product) {
		
		System.out.println(((ProductPart) product).getName()+" was installed successfuly. ");
		
	}

	@Override
	public void installSecondPart(IProductPart product) {
		System.out.println(((ProductPart) product).getName()+" was installed successfuly. ");
		
	}

	@Override
	public void installThirdPart(IProductPart product) {
		System.out.println(((ProductPart) product).getName()+" was installed successfuly. ");
			
	}

	

	
	
	
}
