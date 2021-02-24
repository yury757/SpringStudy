package org.yuyr757.pojo;

public class Address {
    private String name;

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address() {
    }

    public Address(String name) {
        this.name = name;
    }
}
