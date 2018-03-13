package com.javaBasicProgram;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {
    public static void main(String args[])throws Exception{
        JSONObject obj=new JSONObject();
        obj.put("name","siva");
        obj.put("age",new Integer(26));
        obj.put("salary",new Double(10000));
        System.out.println(obj);

        Map hashMap=new HashMap();
        hashMap.put("name","Devi");
        hashMap.put("age",new Integer(26));
        hashMap.put("salary",new Double(50000));

        String strmap=JSONValue.toJSONString(hashMap);
        System.out.println(strmap);

        JSONArray arr=new JSONArray();
        arr.add("sam");
        arr.add(new Integer(5000));
        arr.add(new Double(10000));
        System.out.println(arr);

        List list=new ArrayList();
        list.add("arrayListSiva");
        list.add(new Integer(25));
        list.add(new Double(100000));
        String s= JSONValue.toJSONString(list);
        System.out.println(s);




    }
}
