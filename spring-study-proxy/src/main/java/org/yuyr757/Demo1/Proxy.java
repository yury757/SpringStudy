package org.yuyr757.Demo1;

public class Proxy implements Rent {
    private Host host;

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void seeHouse(){
        System.out.println("中介带看房");
    }

    public void payFee(){
        System.out.println("收取中介费");
    }

    public void rent() {
        this.seeHouse();
        host.rent();
        this.payFee();
    }
}
