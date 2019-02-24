package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 有2个资源OneServlet，TwoServlet
 */
@WebFilter(filterName = "_05DispatcherTypesFilter",urlPatterns = "/TwoServlet",
        dispatcherTypes = DispatcherType.FORWARD)
public class _05DispatcherTypesFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==执行了_05DispatcherTypesFilter过滤请求的代码==");
        chain.doFilter(request,response);
        System.out.println("==执行了_05DispatcherTypesFilter过滤响应的代码==");
    }

    @Override
    public void destroy() {

    }
}
