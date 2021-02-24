import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.pojo.Hello;
import org.yuyr757.pojo.User;
import org.yuyr757.services.UserService;

public class TestHello {
    public static final ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testHello(){
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象都在spring管理，我们要使用的话，直接去spring容器里面取
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }

    @Test
    public void testUserService(){
        UserService userService1 = (UserService) context.getBean("userService");
        userService1.getUser();
        System.out.println("=============================");
        UserService userService2 = (UserService) context.getBean("userServiceMysql");
        userService2.getUser();
        System.out.println("=============================");
        UserService userService3 = (UserService) context.getBean("userServiceOracle");
        userService3.getUser();
    }

    @Test
    public void testUser(){
        System.out.println("=============================");
        User user1 = (User)context.getBean("user1");
        System.out.println(user1.toString());
        System.out.println("=============================");
        User user2 = (User)context.getBean("user2");
        System.out.println(user2.toString());
        System.out.println("=============================");
        User user3 = (User)context.getBean("user3");
        System.out.println(user3.toString());
        System.out.println("=============================");
        User user4 = (User)context.getBean("user4");
        System.out.println(user4.toString());
        System.out.println("=============================");
    }

    @Test
    public void testAlias(){
        System.out.println("=============================");
        User user3 = (User)context.getBean("testuser33333");
        System.out.println(user3.toString());
    }
}
