
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Application {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
/*		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(9);
		emp.setName("Soham");
		emp.setSalary(3000f);
		
		session.save(emp);
				
		tx.commit();
*/
/*		
		String query = "from Employee";
		Query selectQuery = session.createQuery(query);
		List<Employee> results = selectQuery.getResultList();
		
		for(Employee emp : results){
			System.out.println("ID:"+ emp.getEmpId()+ ", Name:"+emp.getName()+", Salary:"+emp.getSalary());
		}
*/
/*		
		Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.gt("salary", 1500f));
		List<Employee> results = criteria.list();
		for(Employee emp : results){
			System.out.println("ID:"+ emp.getEmpId()+ ", Name:"+emp.getName()+", Salary:"+emp.getSalary());
		}
*/
/*		
		Query namedQuery = session.getNamedQuery("findbySalary").setFloat("salary", 2000f);
		List<Employee> results = namedQuery.getResultList();
		for(Employee emp : results){
			System.out.println("ID:"+ emp.getEmpId()+", Name:"+emp.getName()+", Salary:"+emp.getSalary());
		}
*/
		Query namedNativeQuery = session.getNamedNativeQuery("findbySalary").setFloat("salary", 2400f);
		List<Employee> results = namedNativeQuery.getResultList();
		for(Employee emp : results){
			System.out.println("ID:"+ emp.getEmpId()+", Name:"+emp.getName()+", Salary:"+emp.getSalary());
		}
		session.close();
		factory.close();
		

	}

}
