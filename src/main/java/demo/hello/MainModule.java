package demo.hello;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.SetupBy;

//@At("/main")
@SetupBy(MyAppSetup.class)
@Modules(scanPackage = true)//自动搜索子模块
public class MainModule {


}
