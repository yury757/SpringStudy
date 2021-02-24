package org.yuyr757.mapper;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.yuyr757.pojo.User;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUser() {
        return this.getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user){
        return this.getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return this.getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }

    @Override
    public List<User> addDeleteUser() {
        int i1 = this.deleteUser(4);
        System.out.println("delete user affected " + i1 + " rows");
        User user = new User(4, "xiaowang", "asf");
        int i = this.addUser(user);
        System.out.println("add user affected " + i + " rows");
        return this.selectUser();
    }
}
