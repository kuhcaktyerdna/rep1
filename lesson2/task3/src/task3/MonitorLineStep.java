package task3;

public class MonitorLineStep implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		String name = "Monitor";
		IProductPart monitor = new Monitor(name);
		System.out.println(name+ " was built. \n");
		return monitor;
	}
}
