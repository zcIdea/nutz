package demo.hello;

import org.nutz.ioc.IocEventTrigger;

public class MyObjectOnFetchTrigger implements IocEventTrigger {
    @Override
    public void trigger(Object obj) {
        System.out.println("对象获取中。。。。。。");
    }
}
