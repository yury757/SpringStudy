import jdk.nashorn.internal.runtime.PropertyListeners;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.pojo.People;

public class TestAutoWired {
    public static final ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAutoWired1(){
        System.out.println("============================");
        People people1 = context.getBean("people1", People.class);
        people1.getCat().shut();
        people1.getDog().shut();
        System.out.println(people1);
        System.out.println("============================");
        People people2 = context.getBean("people2", People.class);
        people2.getCat().shut();
        people2.getDog().shut();
        System.out.println(people2);
        System.out.println("============================");
        People people3 = context.getBean("people3", People.class);
        people3.getCat().shut();
        people3.getDog().shut();
        System.out.println(people3);
    }

}
