package www.shaojie.xu.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.shaojie.xu.SpringTddTrainingProjectApplication;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringTddTrainingProjectApplication.class)
public @interface DefaultTestConfig {

}
