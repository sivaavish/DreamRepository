package str;

import org.hibernate.*;

import org.hibernate.cfg.*;


public class CustomerAction {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Customer c=new Customer("siva","kannan","siva@gmail.com","9944");
        Address a=new Address("ganshi","bangalore","karnataka");
		Transaction t=s.beginTransaction();
		s.saveOrUpdate(a);
		s.saveOrUpdate(c);
		c.setAddress(a);

		System.out.println("Object Saved SuccessFully");
		t.commit();
		sf.close();
		s.close();
	}

}
