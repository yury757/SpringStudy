import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.pojo.Hello;
import org.yuyr757.pojo.User;

public class TestUser {
    public static final ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUser1(){
        System.out.println("===========================");
        User user5 = (User)context.getBean("user5");
        System.out.println(user5.toString());
        System.out.println("===========================");
        User user6 = (User)context.getBean("user6");
        System.out.println(user6.toString());
        System.out.println("===========================");
        User user7 = (User)context.getBean("user7");
        System.out.println(user7.toString());
    }

    /* ==================测试scope================== */
    @Test
    public void testUser2(){
        System.out.println("===========================");
        User user8 = (User)context.getBean("user8");
        System.out.println(user8.toString());
        System.out.println("===========================");
        User user9 = (User)context.getBean("user9");
        System.out.println(user9.toString());
        System.out.println(user8 == user9);
        System.out.println("===========================");
        User user10 = (User)context.getBean("user10");
        System.out.println(user10.toString());
        System.out.println(user9 == user10);
    }
}
