package task3;

public class AssemblyLine implements IAssemblyLine {


public AssemblyLine (IProductPart part1, IProductPart part2, IProductPart part3) {
	
}	
	
@Override
public IProduct assembleProduct(IProduct fullProduct) {
	System.out.println(((Product) fullProduct).getName()+" was assembled successfuly. ");
	return fullProduct;
}

}
