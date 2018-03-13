package str;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;

import java.util.*;
import java.util.Iterator;

public class CustomerFetchEx {

    public static  SessionFactory sf;
    public static Session session;

    CustomerFetchEx(){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        sf=cfg.buildSessionFactory();
        session=sf.openSession();
        System.out.println("testing");
        System.out.println("Git Testing");
    }

    public static void main(String args[]){
        try{
            /*Configuration cfg=new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sf=cfg.buildSessionFactory();
            Session session=sf.openSession();*/
            //Criteria c=session.createCriteria(Customers.class);
            DetachedCriteria c=DetachedCriteria.forClass(Customer.class);

            List list=c.getExecutableCriteria(session).list();
            System.out.println("List Size>>>>"+list.size());
            Iterator iterator=list.iterator();
            while(iterator.hasNext()){
                Customers customer=(Customers) iterator.next();
                System.out.println("cid>>>>"+customer.getCid());
                System.out.println("FirstName>>>>"+customer.getFirstName());
                System.out.println("Last Name >>>> "+customer.getLastName());
                System.out.println("Email >>> "+customer.getEmail());
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public DetachedCriteria getcriteria(){

        DetachedCriteria criteria= (DetachedCriteria) session.createCriteria(Customer.class);


        return criteria;
    }
}
