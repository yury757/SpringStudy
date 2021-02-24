package org.yuyr757.services;

public class UserServiceImpl implements UserService{
    public int add(int num) {
        if (num < 50) throw new IllegalArgumentException();
        System.out.println("增加了一个用户");
        return num;
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void select() {
        System.out.println("查询了一个用户");
    }
}
