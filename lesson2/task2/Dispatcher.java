public class Dispatcher extends Human{
    
	private String position;
	private String pastPosition;
	
	
	public Dispatcher(String position, String humanName, String humanSurname)
    {
        this.position = position;
		this.humanName= humanName;
		this.humanSurname = humanSurname;
    }
	
	public String getPastPosition()
	{
		return pastPosition;	
	}
	
	public void setPastPosition(String pastPosition)
	{
		this.pastPosition = pastPosition;
	}

	public String getPosition()
	{
		return position;	
	}
	
	public void setPosition(String pastPosition)
	{
		this.position = position;
	}

	public void Greeting(){
		System.out.print("Good morning. Today with you will work "+position+" " +humanName+" "+humanSurname+". ");
	}
	
}