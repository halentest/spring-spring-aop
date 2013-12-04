package cn.halen;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 13-12-3
 * Time: 上午12:32
 * To change this template use File | Settings | File Templates.
 */
public class SpringAOPTest {
    @Test
    public void interceptorTest(){
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        PersonServiceBean personService = (PersonServiceBean)cxt.getBean("personService");
        //PersonServiceBean personService = (PersonServiceBean)cxt.getBean("personService");
        //PersonService personService = new PersonServiceBean();
        personService.save("xx");
        //personService.getPersonName(90);
    }
}
