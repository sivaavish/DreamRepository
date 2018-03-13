package com.hackerRank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class MapEx {


    public static void main(String args[])throws Exception{
       /*
       * Object put(Object key,Object value);
       * Object putAll(Map m)
       * Object get(Object key);
       * Object remove(Object value);
       * Boolean containsKey(Object key);
       * Boolean containsValue(Object value);
       * Boolean isEmpty()
       * int size()
       * void clear()*/
       Product product=new Product();
        Map<String, Product> hmap=new HashMap<>();

        Set set=hmap.keySet();
        Set set1=hmap.entrySet();
        /*
        * Collections views for Map*/
        //Map.Entry entry=hmap.entrySet();
        Iterator iterator=set1.iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("Key >>>"+entry.getKey()+">>>>Value>>>"+entry.getValue());
        }
        
        Map<String,Product> hmap1=new HashMap<String, Product>();
        product.setPid(1);
        product.setPname("phone");
        product.setPcountry("india");
        String hkey= product.getPid()+product.getPname()+product.getPcountry();
        System.out.println(hkey);
        hmap.put(hkey,product);

        product.setPid(2);
        product.setPname("headset");
        product.setPcountry("Germany");
        hkey= product.getPid()+product.getPname()+product.getPcountry();
        System.out.println(hkey);
        hmap.put(hkey,product);

    }
}
