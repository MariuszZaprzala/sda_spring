package Spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public PersonBean personBean(){
        return new PersonBean();
    }

    @Bean
    public Driver driver(){
        return new Driver();
    }

    @Bean
    public CStartEventHandler cStartEventHandler(){
        return new CStartEventHandler();
    }

   // @Bean(initMethod = "init", destroyMethod = "cleanup");
}
