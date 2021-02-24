package org.yuyr757.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.yuyr757.pojo.Student;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class StudentMapperImpl implements StudentMapper {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public List<Student> selectForList() {
        return this.sqlSessionTemplate.getMapper(StudentMapper.class).selectForList();
    }
}
