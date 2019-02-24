package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebFilter(filterName = "_02Demo2Filter",urlPatterns = "/Demo2Servlet")
public class _02Demo2Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==执行了_02Demo2Filter过滤请求的代码==");
        chain.doFilter(request,response);
        System.out.println("==执行了_02Demo2Filter过滤响应的代码==");
    }

    @Override
    public void destroy() {

    }
}
