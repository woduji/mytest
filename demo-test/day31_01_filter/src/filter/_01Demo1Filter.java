package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//1.创建一个自定义类实现Filter接口
//5.使用注解优化
@WebFilter(filterName = "_01DemoFilter",urlPatterns = "/Demo1Servlet")
public class _01Demo1Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //2.重写doFilter方法进行过滤请求与响应
    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==执行了_01Demo1Filter过滤请求的代码==");
        //给到目标资源去执行,filterChain用于放行给目标资源去执行
        filterChain.doFilter(Request,Response);
        System.out.println("==执行了_01Demo1Filter过滤响应的代码==");
    }

    @Override
    public void destroy() {

    }
}
