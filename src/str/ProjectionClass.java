package str;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;

import java.util.Iterator;
import java.util.List;

public class ProjectionClass {
    public static void main(String args[])throws Exception{

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(Customer.class);
        Criterion cn=Restrictions.eq("cid", new Integer(1));
        criteria.add(cn);
        //CriteriaImpl(str.Customer:this[] [lastName=kannan])
        System.out.println(criteria);
        List l=criteria.list();
        Iterator it=l.iterator();
        while(it.hasNext()){
            Customer c=(Customer)it.next();
            System.out.println(c.getCid());
        }
        session.close();
        sessionFactory.close();
    }
}
