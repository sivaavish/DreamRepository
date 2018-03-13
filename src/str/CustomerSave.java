package str;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerSave {
    public static void main(String args[])throws Exception{
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Customers customers=new Customers();
        customers.setFirstName("asdfasf");
        customers.setLastName("Mkannan");
        customers.setEmail("avis@gmail.com");
        customers.setPhone(99446120);
        Transaction tx=session.beginTransaction();
        session.save(customers);
        tx.commit();
        System.out.println("Data inserted Successfully");
        session.close();
        sessionFactory.close();


    }
}
