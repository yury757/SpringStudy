package org.yuyr757.Demo1;

public class Client {
    public static void main(String[] args) {
        // 直接找房东租房
        Host host = new Host();
        host.rent();

        System.out.println("======================");

        // 找中介租房
        // 通过代理可以做一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}

