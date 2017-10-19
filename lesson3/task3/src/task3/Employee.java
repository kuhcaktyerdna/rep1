package task3;

public abstract class Employee {


        private int salary;
	private String rank;
	private final String name;

        public Employee(String name){
            this.name = name;
        }
        
	public int getSalary() {
		return salary;
	}

	
	public void setSalary(int salary) {
		this.salary=salary;
	}

	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank=rank;
	}
        


    public String getName() {
        return name;
    }

}