package demo.hello;


import demo.hello.entity.Person;
import org.nutz.mvc.View;
import org.nutz.mvc.ViewModel;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.view.JspView;
import org.nutz.mvc.view.UTF8JsonView;
import org.nutz.mvc.view.ViewWrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

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

    @At("/test2")
    // 根据返回值确定行为
    @Ok("jsp:${1==1 ? 'jsp.hello' : 'jsp.hello2'}")
    public String doTest2(){
        System.out.println("根据返回值确定行为");
        return "根据返回值确定行为";
    }

    @At("/test3")
    // 根据返回值确定行为
    @Ok("re")
//    @Ok("jsp:/user/login.jsp") // 内部跳转到 /user/login.jsp
    public String doTest3(ViewModel model){
        model.setv("err-msg", "用户名或密码错误");
        if (1==2){
            //浏览器重定向到 /user/login.html
            return ">>:/user/login.html";//webapp下的user文件夹，里面的html页面
//            return "redirect:/user/login.html";//webapp下的user文件夹，里面的html页面
           // forward,内部重定向到,转发 /user/login.htmt
//            return "->:/user/login.html";//webapp下的user文件夹，里面的html页面
//            return "forward:/user/login.html";//webapp下的user文件夹，里面的html页面
        } else{
            return "jsp:jsp.hello2";
        }
    }

    //该视图允许带一个默认视图,当方法返回值为null时调用
    @Ok("re:jsp:/index")
    public String login(@Param("..")String userName, ViewModel model) {
        // 检查登陆参数等等...

        if (userName==null) {
            return null; // 返回null, 则代表走默认视图 jsp:/index
        }
        // 登陆失败
        model.setv("err-msg", "用户名或密码错误");
        return "jsp:/user/login";
    }

    //根据不同的条件，决定返回何种视图
    @At("/viewTest")
    public View viewTest(@Param("type") int type){
        //返回json数据
        if(type==1){
            return new ViewWrapper(new UTF8JsonView(),"It is type="+type);
        }
        if(type<10){
            return  new ViewWrapper(new UTF8JsonView(),"It less than 10!,type="+type);
        }

        //返回jsp页面
        return new ViewWrapper(new JspView("jsp.hello2"),"type="+type);

    }

    //返回 任意 “文本”
    @At("/rawTest")
//    @Ok("raw")
//    @Ok("raw:json") //等价于@Ok("raw:application/json");
//    @Ok("raw:html")//返回html格式的文本
    @Ok("raw:js")
    public String rawTest(HttpServletRequest request, HttpServletResponse response){

//        return "任性返回任意文本";
//        return "<h1>任性返回任意文本</h1>";
        return "alert('任性返回任意文本')";
    }

}
