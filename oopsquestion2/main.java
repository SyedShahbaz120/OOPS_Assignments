package oopsquestion2;

class employee{
	public static double totalSalary()
	{
		double emp1 = 1000;
		double emp2 = 1000;
		double emp3 = 1000;
		double emp4 = 1000;
		double emp5 = 1000;
		double totalSalary = emp1+emp2+emp3+emp4+emp5;
		return totalSalary;
		
	}
	
}
class manager extends employee{
	//incentive
	public static int getBal()
	{
		double i = 200;
		return 200;
	}
	
}
class labour extends employee{
	//overtime
	public static int getBal()
	{
		double o = 100;
		return 100;
	}
	
}

public class main {

	public static void main(String[] args) {
	//double sal = new 
		double totalSalaryOfEMployees = employee.totalSalary()+ labour.getBal()+ labour.getBal();
		System.out.println("Total salaries of all the employees = " + totalSalaryOfEMployees);
		

	}

}
