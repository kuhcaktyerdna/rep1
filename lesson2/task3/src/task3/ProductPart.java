package task3;

public class ProductPart implements IProductPart, ILineStep {

		private String name;
	
		
		public ProductPart (String name) {
			this.name=name;
		}
		
		public String getName() {
		return name;
	}
	
		public void setName(String name) {
		this.name=name;
	}	
		
	
	
	
	
	public IProductPart buildProductPart() 
		{
			ProductPart product = new ProductPart(name);
			System.out.println(name+" was built successfuly. ");
			return product;
		}	
	
	


}

