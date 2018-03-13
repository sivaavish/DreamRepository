package str;


import com.sun.org.apache.regexp.internal.RE;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CriteriaClass {
    public static void main(String args[])throws Exception{

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();

        //Criteria criteria=session.createCriteria(Customer.class);
       // Criterion cn= Restrictions.gt("cid",1);
       // Criterion cn1= Restrictions.lt("cid",3);
      //  Criterion cn2=Restrictions.eq("cid",2);

       // criteria.add(cn);
       // criteria.add(cn1);
       // criteria.add(cn2);
        /*System.out.println("hello World......");
        List list=criteria.list();
        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            Customer customer = (Customer) itr.next();
           System.out.println(customer.getCid());
           System.out.println(customer.getFirtName());
           System.out.println(customer.getLastName());
           System.out.println(customer.getEmail());
            System.out.println(customer.getPhone());
        }
        System.out.println(list.size());*/

        DetachedCriteria detachedCriteria= DetachedCriteria.forClass(Customer.class);

       /* detachedCriteria.createAlias("address","adr");
        detachedCriteria.add(Restrictions.eq("adr.aid",2));*/

        List<Customer> list=new ArrayList<Customer>();
        list=detachedCriteria.getExecutableCriteria(session).list();
        System.out.println(list.size());
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Customer customer=(Customer)iterator.next();
            System.out.println(customer.getCid());
            System.out.println(customer.getFirtName());
            System.out.println(customer.getLastName());
        }
    }
}
