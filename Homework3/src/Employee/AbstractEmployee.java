package Employee;
import java.util.Scanner;
public abstract class AbstractEmployee {
	
//		public static void main(String[] args){	
//			
//			System.out.println("enter position");
//			Scanner in = new Scanner(System.in);
//			String pos = in.nextLine();
//			System.out.println(employeeDuties(pos));
//		}
	
	
		
		public static final int BY_PERCENT = 0;
		public String employeeDuties(String position){
		String duty= "";
		
		switch (position){
		case "CEO" :
		case "ceo" : duty = "Your job is to run the company";
		break;
		
		case "Tester" :
		case "tester" : duty = "Your job is to test the new software";
		break;
		
		case "Developer" :
		case "developer" : duty = "Your job is to develop the new software";
		break;
		
		case "BA":
		case "ba": duty = "Your job is to translate business requirements in to software requirements";		
		break;
		
		//default: duty = "You can select between CEO, Tester, Developer or BA";
		}
		return duty;
	}

	public void setEmployeePosition(String position){
		this.position = position;
	}
	public String getEmployeePosition(){
		return position;
	}
	
	
	protected double salary;
	private String position;
}














