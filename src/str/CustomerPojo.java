package str;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.table.TableRowSorter;

public class CustomerPojo {
    public static void main(String args[])throws Exception{
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Customers customers=new Customers("siva","kannan","siva@gmail.com",9944);
        Request request=new Request("19/10/2017","hello1","ok1");
        Request request1=new Request("19/10/2017","hello2","ok2");

        Transaction transaction=session.beginTransaction();

        session.saveOrUpdate(customers);
        session.saveOrUpdate(request);
        session.saveOrUpdate(request1);
        request.setCustomer(customers);
        request1.setCustomer(customers);

        System.out.println("Data inserted....");
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
