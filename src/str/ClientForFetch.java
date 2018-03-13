package str;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class ClientForFetch {

	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class,new Integer(106));
		Product s=(Product)o;
		// For loading Transaction scope is not necessary...
		System.out.println("Loaded object product name is___"+s.getProName());
 
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();

	}
}
