package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "_04UrlPatternsFilter",urlPatterns = {
        //精准匹配
        "/index.jsp","/index.html","/img/2.jpg","/abcd/*/abc",
        //模糊匹配
        "/abc/*",//前缀匹配
        "*.do"//后缀匹配
})
public class _04UrlPatternsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==执行了_04UrlPatternsFilter过滤请求的代码==");
        chain.doFilter(request,response);
        System.out.println("==执行了_04UrlPatternsFilter过滤响应的代码==");
    }

    @Override
    public void destroy() {

    }
}
