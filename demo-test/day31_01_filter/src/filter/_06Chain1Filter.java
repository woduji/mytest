package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 有2个资源OneServlet，TwoServlet
 */
@WebFilter(filterName = "_06Chain1Filter",urlPatterns = "/Demo4Servlet")
public class _06Chain1Filter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==执行了_06Chain1Filterr过滤请求的代码==");
        chain.doFilter(request,response);
        System.out.println("==执行了_06Chain1Filter过滤响应的代码==");
    }

    @Override
    public void destroy() {

    }
}
