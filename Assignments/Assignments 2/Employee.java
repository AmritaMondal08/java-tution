package Day1;

class EmployeeDetails {
	int EmpId;
	String EmpName;
	int EmpSal;
	static int TotalNoOfEmp;
	public EmployeeDetails(int EmpId,String EmpName,int EmpSal) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.EmpSal=EmpSal;
		TotalNoOfEmp++;
	}
	public EmployeeDetails(int EmpId,String EmpName) {
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		TotalNoOfEmp++;
	}

}
public class Employee{
	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails(105,"Amrita",50000);
		EmployeeDetails emp2 = new EmployeeDetails(20,"Raju");
		System.out.println("Employee 1:"+emp1.EmpId+" "+emp1.EmpName+" "+emp1.EmpSal);
		System.out.println("Employee 2:"+emp2.EmpId+" "+emp2.EmpName);
		System.out.println("Total number of Employee:"+EmployeeDetails.TotalNoOfEmp);
	}
}
