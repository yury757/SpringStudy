package org.yuyr757.Demo2;

public class UserServiceImpl2 implements UserService{
    public void add() {
        System.out.println("使用MySQL新增了一个用户");
    }

    public void delete() {
        System.out.println("使用MySQL删除了一个用户");
    }

    public void update() {
        System.out.println("使用MySQL修改了一个用户");
    }

    public void query() {
        System.out.println("使用MySQL查询了一个用户");
    }
}
