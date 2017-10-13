package task3;

public class MotherboardLineStep implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		String name = "Motherboard";
		IProductPart motherboard = new Motherboard(name);
		System.out.println(name+ " was built. ");
		return motherboard;
	}
}
