import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.mapper.UserMapper;
import org.yuyr757.pojo.User;
import java.util.List;

public class TestUserMapper {
    private static ClassPathXmlApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUser(){
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testDeleteUser(){
        UserMapper userMapperImpl = context.getBean("userMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.addDeleteUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
