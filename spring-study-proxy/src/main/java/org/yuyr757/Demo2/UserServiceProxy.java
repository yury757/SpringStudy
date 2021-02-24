package org.yuyr757.Demo2;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("使用了add");
        this.userService.add();
    }

    public void delete() {
        log("使用了delete");
        this.userService.delete();
    }

    public void update() {
        log("使用了update");
        this.userService.update();
    }

    public void query() {
        log("使用了query");
        this.userService.query();
    }

    public void log(String message){
        System.out.println(message);
    }
}
