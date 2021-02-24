package org.yuyr757.mapper;

import org.yuyr757.pojo.User;

import java.util.List;

public interface UserMapper {

    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);

    public List<User> addDeleteUser();
}
