package org.yuyr757.pojo;

public class User {
    private int id;
    private String name;

    public User() {
        System.out.println("调用了无参构造方法");
    }

    public User(int id, String name) {
        System.out.println("调用了有参构造方法");
        this.id = id;
        this.name = name;
    }

    public String getName() {
        System.out.println("调用了getName方法");
        return name;
    }

    public void setName(String name) {
        System.out.println("调用了setName方法");
        this.name = name;
    }

    public int getId() {
        System.out.println("调用了getId方法");
        return id;
    }

    public void setId(int id) {
        System.out.println("调用了setId方法");
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
