package tel_ran.employee.entity;

//рассчет налога
// расчитать зп нетто
// ax^2 + bx + c = 0, дискриминант, расчет квадратного уравнения
/*
 0 - 6220 - 10%
 6221 - 8920 - 14%
 8921 - 14320 - 20%
 14321 - 19900 - 31%
 19901 - 41410 - 35%
 41411 - 53333 - 47%
 53334 - 		- 50%
 
 
 
 
 */
public class Employee {

	private int id;
	private String name;
	private double salary;
	private double taxAllowance;
	private double tax;
	private double taxTotal;
	private double salaryNetto;

	public void setId(int id1) {

		if (id1 >= 100000000 && id1 <= 999999999) {
			id = id1;
		} else {
			System.out.println("Wrong ID");
		}

	}

	public int getId() {

		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;

			if (salary > 0 && salary <= 6220) {
				this.tax = 10;
			}

			else if (salary > 6220 && salary <= 8920) {
				this.tax = 14;
			}

			else if (salary > 8920 && salary <= 14320) {
				this.tax = 20;
			}

			else if (salary > 14320 && salary <= 19900) {
				this.tax = 31;
			}

			else if (salary > 19900 && salary <= 41410) {
				this.tax = 35;
			}

			else if (salary > 41410 && salary <= 53333) {
				this.tax = 47;
			} else {

				this.tax = 50;
			}

			
		} else

		{
			System.out.println("Wrong salary");
		}
	}

	public double getTaxAllowance() {
		return taxAllowance;
	}

	public void setTaxAllowance(double taxAllowance) {
		this.taxAllowance = taxAllowance;
	}
/*
	public void setTax(double tax) {

		this.tax = tax;

	}

	public double getTax() {
		return tax;
	}
*/
	public void calcTaxes() {

		taxTotal = (salary * tax) / 100 + (salary * taxAllowance) / 100;

	}

	public void calcSalaryNetto() {

		salaryNetto = salary - taxTotal;
	}

	public void display() {

		System.out.println("Id = " + id + ", Name = " + name + ", Salary = " + salary);
		System.out.println("taxAllowance = " + taxAllowance + " Tax = " + tax + " Total Taxes = " + taxTotal);
		System.out.println("Salary netto = " + salaryNetto);
		System.out.println(" ");

	}

}
