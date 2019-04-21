package demo.hello.entity;

import org.nutz.ioc.loader.annotation.IocBean;

import java.util.Calendar;

//@IocBean
@IocBean(name = "pet",singleton = false)
public class Pet {

    private String name;

    private Calendar birthday;

    private Pet friend;

    public Pet() {}

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Pet getFriend() {
        return friend;
    }

    public void setFriend(Pet friend) {
        this.friend = friend;
    }
}