package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleHelloWorld {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("first object");
        obj.getMessage();

        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();

        Zadanie1 z1 = (Zadanie1) context.getBean("zadanie1");
        z1.suma();
        System.out.println(z1.suma());
        z1.setZmienna1(5);
        System.out.println(z1.suma());
        System.out.println("zmienna1 "+z1.getZmienna1()+" + zmienna2 "+z1.getZmienna2()+" suma "+z1.suma());

        Zadanie1 z2 = (Zadanie1)context.getBean("zadanie1");

        System.out.println("z2 = " + z2);
        System.out.println(z1);

        System.out.println("z1 = " + z1.getZmienna1());

        SpringSingleton springSingleton = (SpringSingleton) context.getBean("singleton");

        springSingleton.setZmA(3);
        System.out.println("springSingleton = " + springSingleton.getZmA());

        SpringSingleton springSingleton1 = (SpringSingleton) context.getBean("singleton");
        springSingleton1.setZmA(0);
        System.out.println("springSingleton = " + springSingleton1.getZmA());
        System.out.println("springSingleton = " + springSingleton.getZmA());

        BeanForTemplate beanForTemplate = (BeanForTemplate) context.getBean("beanForTemplate");

        System.err.println(beanForTemplate.getMessage1());
        System.out.printf("message 2 ", beanForTemplate.getMessage2());
        System.out.println("beanForTemplate.getMessage3() = " + beanForTemplate.getMessage3());
        System.out.printf("sss " , beanForTemplate.getMessage2());


        InitDestroyBean initDestroyBean = (InitDestroyBean) context.getBean("initDestroy");

        context.close();

    }
}
