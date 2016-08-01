package Employee;

public class ExtendImplementEmployee extends AbstractEmployee implements InterfaceEmployee {
	
	
	private int id;
	private String name;
	private String location;
	
	
	public void setEmployeeID(){
		this.id = 100;
		id ++;
	}

	public int getEmployeeID() {
		return id;
	}

	public String getEmployeeName() {
		return name;
	}

	public String getEmployeeLocation() {
		return location;
	}

	public double getEmployeeSalary() {
		return salary;
	}

	public void setEmployeeName(String name) {
		this.name = name;		
	}

	public void setEmployeeLocation(String location) {
		this.location = location;		
	}

	public void setEmployeeSalary(double salary) {
		this.salary = salary;
	}
	
public double raiseSalary(double byPercent){
		
		double raise = salary*byPercent/100;
				salary += raise;
		return salary;
		}
	
	
}
