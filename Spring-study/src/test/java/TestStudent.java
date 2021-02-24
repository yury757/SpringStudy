import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yuyr757.pojo.Student;

public class TestStudent {
    public static final ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testStudent1(){
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());

    }
}
