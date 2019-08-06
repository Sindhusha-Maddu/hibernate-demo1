import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*@NamedQueries({
	@NamedQuery(
			name="findbySalary",
			query="from Employee e where e.salary > :salary"
			)
})*/

@NamedNativeQueries({
	@NamedNativeQuery(
			name="findbySalary",
			query="select * from employee e where e.salary > :salary",
			resultClass=Employee.class
			)
})

@Entity
@Table
public class Employee {
	@Id
	@Column(name = "id")
	private int EmpId;
	@Column(name= "name")
	private String name;
	@Column(name = "salary")
	private float salary;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
