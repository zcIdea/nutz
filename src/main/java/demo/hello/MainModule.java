package demo.hello;

import org.nutz.ioc.loader.annotation.AnnotationIocLoader;
import org.nutz.mvc.adaptor.PairAdaptor;
import org.nutz.mvc.annotation.*;
import org.nutz.mvc.ioc.provider.AnnotationIocProvider;

//@At("/main")
//@AdaptBy(type = PairAdaptor.class,args = {})
@AdaptBy(type = PairAdaptor.class)//默认的，如果你什么也不写，Nutz.Mvc 会采用 org.nutz.mvc.adaptor.PairAdaptor （也就是名值对的方式） 来适配你的 HTTP 参数。
@IocBy(type = AnnotationIocProvider.class,args = {"demo.hello.*"})
@SetupBy(MyAppSetup.class)
@Modules(scanPackage = true)//自动搜索子模块
public class MainModule {


}
