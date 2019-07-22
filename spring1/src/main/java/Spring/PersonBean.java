package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonBean {
    private String name;

    public PersonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);

        PersonBean personBean = ctx.getBean(PersonBean.class);
        personBean.setName("Hubert Sielecki");
        System.out.println(personBean.getName());

        PersonBean personBean1 =  ctx.getBean(PersonBean.class);
        personBean1.setName("Mariusz Zaprzala");
       // personBean1.setName("Andrzej Fornalik");
        System.out.println(personBean.name);
        System.out.println(personBean.getName());
    }
}
