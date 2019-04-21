package demo.hello;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器
 */
public class MyFilter implements Filter {
    public void destroy() {}
    public void init(FilterConfig arg0) throws ServletException {}
    
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        req.setAttribute("$request", req);
        chain.doFilter(req, resp);
    }
}