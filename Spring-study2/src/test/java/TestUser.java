import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuyr757.config.MyConfig;
import org.yuyr757.pojo.User;

import java.net.ConnectException;

public class TestUser {
    public static ApplicationContext context;

    static {
        context = new AnnotationConfigApplicationContext(MyConfig.class);
    }

    @Test
    public void testUser1(){
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }

}
