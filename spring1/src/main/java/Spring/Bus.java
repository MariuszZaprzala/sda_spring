package Spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class Bus {
    private Driver driver;

    public Bus(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);


    }
}
