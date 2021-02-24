import org.junit.Test;
import org.yuyr757.mapper.StudentMapper;
import org.yuyr757.pojo.Student;

import java.util.List;

public class TestStudent {
    @Test
    public void testStudent1(){
        StudentMapper studentMapper = SpringContext.context.getBean("studentMapperImpl", StudentMapper.class);
        List<Student> students = studentMapper.selectForList();
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
