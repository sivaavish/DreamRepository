package str;

import com.sun.org.apache.regexp.internal.RE;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.*;


public class DetachedCriteriaForCustomer  {
    public static void main(String args[])throws Exception{
        DetachedCriteriaForCustomer dec=new DetachedCriteriaForCustomer();
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
       // DetachedCriteria detachedCriteria=session.createCriteria(Customers.class).;
        /*DetachedCriteria criteria=dec.getDetachedCriteria();
        List<Customers> cuslist=new ArrayList<Customers>();
        cuslist=criteria.getExecutableCriteria(session).list();
        System.out.println("List Size>>>>>>>>>"+cuslist.size());
        Iterator iterator=cuslist.iterator();
        while (iterator.hasNext()){
            Customers customers=(Customers)iterator.next();
            System.out.println(customers.getCid());
            System.out.println(customers.getFirstName());
            System.out.println(customers.getLastName());
        }*/

        Criteria crit=session.createCriteria(Customers.class);
       // crit.add(Restrictions.eq("firstName","Raju"));
        crit.setProjection(Projections.property("firstName"));
        List<Customers> list=crit.list();
        System.out.println("list size>>>>>>>"+list.size());

        /*for (Customers customers:list){
            //System.out.println("CustomerId>>>>>>"+customers.getCid());
            System.out.println("CustomersName>>>>"+customers.getFirstName());
        }*/

    }


    public DetachedCriteria getDetachedCriteria(){
        DetachedCriteria criteria=DetachedCriteria.forClass(Customers.class);
        criteria.add(Restrictions.like("phone", 9944L));
        criteria.add(Restrictions.eq("phone",9944L));
        criteria.add(Restrictions.sqlRestriction(""));
        return criteria;
    }
}
