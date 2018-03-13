package str;

import org.hibernate.*;

import org.hibernate.cfg.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

public class ClientForSave { 
 
    public static void main(String[] args)
    {
 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
 
        SessionFactory factory = cfg.buildSessionFactory();
        Product p=new Product();

        p.setProductId(113);
        p.setProName("siva");
        p.setPrice(15000);
        p.setProductname("Watch");
        p.setStartdate(new Timestamp(System.currentTimeMillis()));

        Session session = factory.openSession();
        /*Criteria c=session.createCriteria(Product.class);*/
        /*Criterion ct= Restrictions.eq("productId",110);
        c.add(ct);*/
        /*c.setProjection(Projections.property("productId"));
        List l=c.list();
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            Integer i=(Integer)itr.next();
            System.out.println(i);
        }
        */

       /* Testing test=new Testing();
        test.setTname("siva");*/
        Transaction tx = session.beginTransaction();
        //session.save(p);
        session.saveOrUpdate(p);
       /* session.save(test);*/
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
    }
 
}
