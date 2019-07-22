package Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

public class CStartEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("RRefresh");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);


    }
}
