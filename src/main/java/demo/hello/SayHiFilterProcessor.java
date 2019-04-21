package demo.hello;

import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;
import org.nutz.mvc.impl.processor.AbstractProcessor;

/**
 * 拦截器
 */
public class SayHiFilterProcessor extends AbstractProcessor implements ActionFilter {

    public View match(ActionContext ac) {
//        log.debug("match? maybe.");
        return null;
    }
    
    public void process(ActionContext ac) throws Throwable {
//        log.debug("before doNext");
        doNext(ac);
//        log.debug("after doNext");
    }
}