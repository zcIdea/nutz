package demo.hello;

import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

/**
 * @SetupBy - 应用启动以及关闭时的额外处理
在整个应用启动或者关闭时，你想做一些额外的处理工作，你可以实现一个 org.nutz.mvc.Setup 接口，并将其配置在主模块上
 */
public class MyAppSetup implements Setup {
    @Override
    public void init(NutConfig nc) {
        System.out.println("应用启动初始化");

    }


    @Override
    public void destroy(NutConfig nc) {
        System.out.println("应用关闭销毁");
    }
}
