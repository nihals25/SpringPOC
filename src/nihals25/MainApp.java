package nihals25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloworld");
        obj1.setMessage("First Object");
        System.out.println(obj1.getMessage());
        HelloWorld obj2 = (HelloWorld) context.getBean("helloworld1");
        obj2.setMessage("Hi This is Nihal");
        System.out.println(obj2.getMessage());
        HelloWorld obj3 = (HelloWorld) context.getBean("helloworld1");
        System.out.println(obj3.getMessage());
    }
}