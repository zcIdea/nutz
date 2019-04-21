package demo.hello.entity;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import java.util.Date;

@InjectName("person")
@IocBean(create = "init",fetch = "demo.hello.MyObjectOnFetchTrigger",depose = "onDepose")
public class Person {

    private int age;
    private String name;
    private Date birth;

    @Inject
    private Pet pet;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }

    public void init(){
        System.out.println("对象初始化......");
    }
    public void onDepose(){
        System.out.println("对象销毁......");
    }
}
