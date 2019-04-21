package demo.hello;

import demo.hello.entity.Person;
import demo.hello.entity.Pet;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.annotation.AnnotationIocLoader;

public class AnnotationDemo {

    public static void main(String[] args) {
        Ioc ioc=new NutIoc(new AnnotationIocLoader("demo.hello"));

        Person person=ioc.get(Person.class,"person");
        System.out.println(person);

        Pet pet=ioc.get(Pet.class,"pet");
        System.out.println(pet);
        Pet pet1=ioc.get(Pet.class,"pet");
        System.out.println(pet==pet1);

    }

}
