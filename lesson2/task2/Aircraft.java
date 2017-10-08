public class Aircraft {

	private String flight;
	private String manufacturer;
	private int modelNumber;

	public Aircraft (String flight, String manufacturer, int modelNumber){
		this.flight=flight;
		this.manufacturer=manufacturer;
		this.modelNumber=modelNumber;
		System.out.println("Aircraft info: "+manufacturer+" "+modelNumber);
	}
	
	public String getFlight(){
		return flight;
	}
	
	public void setFlight(String flight) {
		this.flight=flight;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	
	public int getModelNumber() {
		return modelNumber;
	}
	
	public void setModelNumber() {
		this.modelNumber=modelNumber;
	}
	
	
	
	
	
}