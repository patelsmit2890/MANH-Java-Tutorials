package mainpack;

import java.util.Iterator;
import java.util.List;

import model.entities.Employee;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=null;

		//Insert
		/*try{
			factory=new Configuration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.err.println("Failed to create Session Factory object: "+ex);
			throw new ExceptionInInitializerError(ex);
		}
		Session session=factory.openSession();
		Transaction tx=null;
		Integer employeeID=null;

		try{
			tx=session.beginTransaction();
			Employee emp=new Employee("Ganesh","Agarwal",25000,"67858624");
			employeeID=(Integer)session.save(emp);
			tx.commit();
		}catch(HibernateException e){
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}*/


		//Select
		try{
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			List employees = (List) session.createQuery("FROM Employee").list(); 
			for (Iterator iterator = ((java.util.List) employees).iterator(); iterator.hasNext();){
				Employee employee = (Employee) iterator.next(); 
				System.out.println("First Name: " + employee.getFirst_name()); 
				System.out.println("Last Name: " + employee.getLast_name()); 
				System.out.println("Salary: " + employee.getSalary()); 
				System.out.println("Phone: " + employee.getPhone()); 
			}
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
		

		//Like command
		/*try{
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Employee.class);
			crit.add(Restrictions.like("last_name", "%g%")); // Like condition
			crit.setMaxResults(5); // Restricts the max rows to 5

			List employees = crit.list();
			for (Iterator it = employees.iterator(); it.hasNext();) {
				Employee employee = (Employee) it.next();
				System.out.println("ID: " + employee.getEid());
				System.out.println("First Name: " + employee.getFirst_name());

			}
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}*/


		//Update
		/*try{
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Employee employee =	(Employee)session.get(Employee.class,22); 
			employee.setSalary( 57000 );
			session.update(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}*/
		
		
		//DELETE/////////////////////////////////////////////////////////////////

		/*try{
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		Session session = factory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Employee employee =	(Employee)session.get(Employee.class,21); 
			session.delete(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}*/


	}

}
