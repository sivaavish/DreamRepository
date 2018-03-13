package SpringTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionClass {
    public static void main(String args[]){
        System.out.println("hello Dependency Injection>>>>");
        ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
        System.out.println("After the Application Context File");
        SpringBeanClass obj = (SpringBeanClass) context.getBean("helloBean");
        obj.show();
    }

}
