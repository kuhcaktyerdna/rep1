package task3;

public class BodyLineStep implements ILineStep {
	
	@Override
	public IProductPart buildProductPart() {
		String name = "Body";
		IProductPart body = new Body(name);
		System.out.println(name+ " was built. ");
		return body;
	}
}
