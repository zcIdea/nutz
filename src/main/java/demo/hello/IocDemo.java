package demo.hello;

import demo.hello.entity.Pet;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;

public class IocDemo {

    public static void main(String[] args) {
        //1.打开ioc容器，获取ioc配置文件
        Ioc ioc=new NutIoc(new JsonLoader("ioc/pets.js"));
        //2.获取配置中的实例对象
        Pet pet=ioc.get(Pet.class,"xiaobai");
        System.out.println("name:"+pet.getName()+",birthday:"+pet.getBirthday().getTime());

//        Pet xiaohei=ioc.get(null,"xiaohei");
//        System.out.println("name:"+xiaohei.getName()+",birthday:"+xiaohei.getBirthday().getTime()+",xiaobai:"+xiaohei.getFriend().getName());

        Pet xb=ioc.get(Pet.class,"xb");
        System.out.println("name:"+xb.getName()+",xh:"+xb.getFriend().getName());

        //声明了 singleton: false，那么它每次获取，都会生成一个新的实例
        /*Pet p1 = ioc.get(null, "xiaohei");
        Pet p2 = ioc.get(null, "xiaohei");
        System.out.println(p1==p2);*/

        //3.关闭ioc容器
        ioc.depose();


    }
}
