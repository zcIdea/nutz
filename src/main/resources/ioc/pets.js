/*
 *开始写 var ioc={ , 是为了利用 eclipse 的  javascript 编辑器的自动格式化功能}
 */

var ioc={

    /*
    *  默认的，仅仅需要直接申明每个字段的值即可，Nutz.ioc会为你转型
    * */
    xiaobai:{
        name : '小白',
        birthday :'2019-04-14 12:11:09'
    },


    /*
    * 当然也可以做更细致的设置
    * */
    xiaohei:{
        type : 'demo.hello.entity.Pet',//类型：全路径
        singleton : false,//是否单利:声明了 singleton: false，那么它每次获取，都会生成一个新的实例
        args : ['小黑'],//构成函数参数
        fields : {
            birthday : '2018-01-09 8:09:09',
            friend : {refer : 'xiaobai'}//依赖注入：指向容器里另外一个对象
        }
    },

    // friend：内部对象
    xb : {
        friend: {
            type : 'demo.hello.entity.Pet',
            // fields : {name : 'XiaoHei'}
            // fields : {name : {env : "JAVA_HOME"}}//evn:环境变量
            // fields : {name :  {env : ["JAVA_HOME", "/bin/java"]} }//evn:环境变量 需要JAVA_HOME下面的/bin/java的路径,可以写为如果某个环境变量不存在的时候当成空字符串,那么,在前面加个感叹号
            fields : {name :  {env : ["!JAVA_HOME", "/bin/java"]} }//evn:环境变量
        }
    }

}