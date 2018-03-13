package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;



public class TestingClass {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Testing t=new Testing();
		/*t.settId(2);*/
		t.setTname("devi");
		Transaction ts=session.beginTransaction();
		session.saveOrUpdate(t);
		ts.commit();
		System.out.println("hibernate working");
		sf.close();
		session.close();
		
	}
	
	

}
