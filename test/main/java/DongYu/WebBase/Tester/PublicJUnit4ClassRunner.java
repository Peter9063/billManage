package DongYu.WebBase.Tester;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;



public class PublicJUnit4ClassRunner extends SpringJUnit4ClassRunner{

    static {
        try {
            Log4jConfigurer.initLogging("classpath:DongYu/WebBase/Tester/log4j.properties");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }

    public PublicJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
    	super(clazz);
    }

}
