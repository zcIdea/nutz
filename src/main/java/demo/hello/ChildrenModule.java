package demo.hello;


import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

@At("/children")
public class ChildrenModule {

    @At("/hello")
    @Ok("jsp:jsp.hello")
    public String doHello(@Param("id") int id,@Param("name") String name){
        return "heloo Nutz!id="+id+",name="+name;
    }

    @At("/test")
    @Ok("json")
    public String doTest(@Param("id") int id,@Param("name") String name){
        System.out.println("id="+id+",name="+name);
        return "eeemsg:heloo Nutz!id="+id+",name="+name;
    }
    @At("/test1")
    @Ok("json")
    public String doTest1(@Param("id") int id,@Param("name") String name){
        System.out.println("id="+id+",name="+name);
        return "eeemsg:heloo Nutz!id="+id+",name="+name;
    }
}
