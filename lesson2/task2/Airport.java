public class Airport {

	private String adress;
	private String name;
	private int telephoneNum;
	
	
	public Airport (String name, String adress, int telephoneNum){
		this.name=name;
		this.adress=adress;
		this.telephoneNum=telephoneNum;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getTelephoneNum() {
		return telephoneNum;
	}
	
	public void setTelephoneNum(int telephoneNum){
		this.telephoneNum=telephoneNum;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress){
		this.adress=adress;
	}
	
	public void advertisment(){
		System.out.println("Wanna travel and not to spend much money? Wanna give trip as original gift? You can do it with the help of "+name+". You can find us at "+adress+" or call us: "+telephoneNum);
	}
	
	}