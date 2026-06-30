import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App{

    static Logger log=LoggerFactory.getLogger(App.class);

    public static void main(String args[]){

        log.info("Application started");

        int a=10;
        int b=20;

        log.debug("Values are {} and {}",a,b);

        int ans=a+b;

        log.info("Sum = {}",ans);

        log.warn("This is a warning message");

        log.error("This is an error message");
    }
}