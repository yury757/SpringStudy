import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.services.UserService;

public class TestAop1 {
    public static final ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testAopAroundReturning(){
        System.out.println("【开始测试正常返回时的通知结果】");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        int num = userService.add(188);
        System.out.println(num);
    }

    @Test
    public void testAopAroundThrowing(){
        System.out.println("【开始测试报异常时的通知结果】");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        int num = userService.add(1);
        System.out.println(num);
    }
}
